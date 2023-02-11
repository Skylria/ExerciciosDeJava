/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista1;

import lista1.Estoque;

/**
 *
 * @author julia
 */
public class UsaEstoque {
    public static void main(String[] args) {
        /* Exercício 7: 
         * Escreva uma classe UsaEstoque que vai instanciar os 3 objetos a seguir:
         */
        // estoque1 nome: Impressora Jato de Tinta, qtdAtual: 13, tdMinima: 6
           Estoque estoque1 = new Estoque("Impressora Jato de Tinta", 13, 6);

        // estoque2 nome: Monitor LCD 17 polegadas, qtdAtual: 11, qtdMinima: 13
           Estoque estoque2 = new Estoque("Monitor LCD 17 polegadas", 11, 13);

        //estoque3 nome: Mouse Ótico, qtdAtual: 6, qtdMinima: 2
           Estoque estoque3 = new Estoque("Mouse Ótico", 6, 2);

        //a) Dar baixa em 5 unidades de estoque1.
        estoque1.darBaixa(5);
        
        //b) Fazer a reposição de 7 unidades de estoque2.
        estoque2.repor(7);
        
        //c) Dar baixa em 4 unidades de estoque3.
        estoque3.darBaixa(4);
        
        //d) Exibir a saída do método precisaRepor dos 3 objetos.
        System.out.println(estoque1.precisaRepor());
        System.out.println(estoque2.precisaRepor());
        System.out.println(estoque3.precisaRepor());
        //e) Exibir a saída do método mostra para apresentar as informações sobre
        //   os 3 objetos.
        System.out.println(estoque1.mostrar());
        System.out.println(estoque2.mostrar());
        System.out.println(estoque3.mostrar());
    }
}
