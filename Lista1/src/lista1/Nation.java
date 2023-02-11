/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista1;

/**
 *
 * @author Juliana
 */
public class Nation {
    private double population;
    private double grownRate;
    
    public Nation(double population, double grownRate){
        this.population = population;
        this.grownRate = grownRate;
    }       
    
    public double getPopulation(){
        return population;
    }
    public void setPopulation(double population){
        this.population = population;
    }
    
    public double getGrownRate(){
        return grownRate;
    }
    
    public void setGrownRate(double grownRate){
        this.grownRate = grownRate;
    }
    
    public double GrowthPerMonth(double pop, double gR){
        double growthValue = (pop * gR)/100;
        double finalValue = pop + growthValue;
        pop = finalValue;
        this.setPopulation(pop);
        return pop;       
    }
    
    public static void main(String[] args) {
        /*Exercício 1:
         * Supondo que a população de um país A seja de 55.000 habitantes e tem
         * uma taxa de crescimento mensal de 0,3%. A população de um país B tem
         * 160.000 habitantes e tem uma taxa de crescimento mensal de 0,18%.
         * Faça um programa que calcule e escreva o número de meses necessários
         * para que a população do país A ultrapasse ou iguale a população do país
         * B, mantidas as taxas de crescimento.
         */
        Nation paisA = new Nation(55000.0, 0.3);
        Nation paisB = new Nation(160000, 0.18);
        int cont = 0;
        while (paisA.getPopulation() <= paisB.getPopulation()){ 
            paisA.GrowthPerMonth(paisA.getPopulation(),paisA.getGrownRate());
            paisB.GrowthPerMonth(paisB.getPopulation(),paisB.getGrownRate());
            cont ++;
        }
        System.out.println("Serão necessários " + cont + " meses para o país A ultrapassar ou igualar a população do país B");
    }
}
