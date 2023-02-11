/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista1;

import java.util.Scanner;

/**
 *
 * @author Juliana
 */
public class Table {
    private int number;
  
    public Table(int number){
        this.number = number;
    }
    
    public int getNumber(){
        return number;
    }
    
    public void tablesTimes(int n){
        int cont = 1;
        System.out.println("o Tabuada de " + n);
        while (cont != 11){
            System.out.println(" o " + n + " X " + cont + " = " + n * cont + "");
            cont ++;
        }
    }
    public static void main(String[] args) {
        /*Exercício 2:
     * 2. Desenvolva um gerador de tabuada, capaz de gerar a tabuada de
     * qualquer número inteiro entre 1 a 10. O usuário deve informar de qual
     * numero ele deseja ver a tabuada. A saída deve ser conforme o exemplo
     * abaixo:
       o Tabuada de 5:
        o 5 X 1 = 5
        o 5 X 2 = 10
        o ...
        o 5 X 10 = 50
    */ 
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o número que deseja calcular: ");
        int number = s.nextInt();
        Table tabuada = new Table(number);
        
        tabuada.tablesTimes(tabuada.getNumber());
       
    }
}
