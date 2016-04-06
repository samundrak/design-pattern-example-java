/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternsexample.factory;

/**
 *
 * @author samundra
 */
public class ColdDrinks {

    private double cost;
    private double weight;
    private String name;

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

     

    public void shake() {
        System.out.println(getName() + " is shaking ...!!!!");
    }
}
