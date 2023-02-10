/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista1;

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
    
}
