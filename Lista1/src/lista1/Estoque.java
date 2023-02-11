/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista1;

/**
 *
 * @author julia
 */
public class Estoque {
    // Exercício 6:
    /* Escreva uma classe em Java chamada Estoque. Ela deverá possuir:
       a) os atributos
          nome (String)
          qtdAtual (int)
          qtdMinima (int).
    */       
    private String nome;
    private int qtdAtual;
    private int qtdMinima;
    
    /* b) um construtor sem parâmetros e outro contendo os parâmetros (nome,
       qtdAtual, e qtdMinima).
    */
    public Estoque(){}
    
    public Estoque(String nome, int qtdAtual, int qtdMinima){
        this.nome = nome;
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;
    }
    
    // c) os métodos com as seguintes assinaturas:
    //mudarNome(nome)
    public void mudarNome(String nome){
        this.nome = nome;
    }
    //mudarQtdMinima(qtdMinima)
    public void mudarQtdMinima(int qtdMinima){
        this.qtdMinima = qtdMinima;
    }
    //repor(qtd)
    //O método repor aumenta qtdAtual de acordo com o parâmetro qtd.
    public void repor(int qtd){
        this.qtdAtual += qtd;
    }
    //darBaixa(qtd) 
    //O método darBaixa diminui qtdAtual de acordo com o parâmetro qtd. 
    public void darBaixa(int qtd){
        this.qtdAtual -= qtd;
    }
    //mostrar()
    // O método mostrar() retorna uma String contendo 
    // o nome do produto, sua quantidade mínima, sua quantidade atual.
    public String mostrar(){
        String show = "" + this.nome + " " + this.qtdMinima + " " + this.qtdAtual + "";
        return show;
              
    }
    //precisaRepor()
    // O método precisaRepor retorna true caso a quantidade
    // atual esteja menor ou igual a quantidade mínima e false, caso contrário.
    public boolean precisaRepor(){
        return this.qtdAtual <= this.qtdMinima ? true : false;
    }
    //d) os atributos qtdAtual e qtdMinima jamais poderão ser negativos.
}
