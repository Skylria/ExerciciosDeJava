/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista1;
import java.util.Scanner;
/**
 *
 * @author Juliana
 */
public class Lista1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Exercício 1:
         * Supondo que a população de um país A seja de 55.000 habitantes e tem
         * uma taxa de crescimento mensal de 0,3%. A população de um país B tem
         * 160.000 habitantes e tem uma taxa de crescimento mensal de 0,18%.
         * Faça um programa que calcule e escreva o número de meses necessários
         * para que a população do país A ultrapasse ou iguale a população do país
         * B, mantidas as taxas de crescimento.
         */
//        Nation paisA = new Nation(55000.0, 0.3);
//        Nation paisB = new Nation(160000, 0.18);
//        int cont = 0;
//        while (paisA.getPopulation() <= paisB.getPopulation()){ 
//            paisA.GrowthPerMonth(paisA.getPopulation(),paisA.getGrownRate());
//            paisB.GrowthPerMonth(paisB.getPopulation(),paisB.getGrownRate());
//            cont ++;
//        }
//        System.out.println("Serão necessários " + cont + " meses para o país A ultrapassar ou igualar a população do país B");
    
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
//        Scanner s = new Scanner(System.in);
//        System.out.println("Digite o número que deseja calcular: ");
//        int number = s.nextInt();
//        Table tabuada = new Table(number);
//        
//        tabuada.tablesTimes(tabuada.getNumber());
        
    /*Exercício 3: 
     * 3. Desenvolver um programa que efetue a soma de todos os números
     * ímpares que são múltiplos de três e que se encontram no conjunto dos
     * números de 1 até 500.
    */
//        int resultado = 0;
//        for (int i = 0; i < 501; i++){
//            if (i % 2 >0 && i % 3 == 0){
//                resultado += i;
//            }
//        }
//        System.out.println(resultado);
    
    /*Exercício 4:
     * Desenvolver um programa que leia a altura de 15 pessoas. Este
     * programa deverá calcular e mostrar:
        a. A menor altura do grupo;
        b. A maior altura do grupo;
    */
        Scanner s = new Scanner(System.in);
        int[] heights = new int[10];
        for (int i = 0; i < 10; i++){
            System.out.println("Altura: ");
            heights[i] = s.nextInt();
        }
        int minheight = 500;
        int maxheight = 0;
        for (int i : heights){
            if (i < minheight){
                minheight = i;
            }
            else if (i > maxheight){
                maxheight = i;
            }
        }
        System.out.println("A menor altura eh: " + minheight);
        System.out.println("A maior altura eh: " + maxheight);
        
    /*Exercício 5: 
     * Escrever um algoritmo que leia uma quantidade desconhecida de
     * números e conte quantos deles estão nos seguintes intervalos: [0-25],
     * [26-50], [51-75] e [76-100]. A entrada de dados deve terminar quando
     * for lido um número negativo.
     */   
        
    
    }
}