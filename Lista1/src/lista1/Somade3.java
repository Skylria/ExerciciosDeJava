/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista1;

/**
 *
 * @author julia
 */
public class Somade3 {
    public static void main(String[] args) {
        /*Exercício 3: 
     * 3. Desenvolver um programa que efetue a soma de todos os números
     * ímpares que são múltiplos de três e que se encontram no conjunto dos
     * números de 1 até 500.
    */
        int resultado = 0;;
        for (int i = 0; i < 501; i++){
            if (i % 2 >0 && i % 3 == 0){
                resultado += i;
            }
        }
        System.out.println(resultado);
    }
}
