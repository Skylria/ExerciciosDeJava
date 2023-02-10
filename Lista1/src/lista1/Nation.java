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
}
