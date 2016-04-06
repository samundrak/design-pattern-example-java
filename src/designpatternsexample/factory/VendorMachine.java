/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternsexample.factory;

import java.util.Scanner;

/**
 *
 * @author samundra
 */
public class VendorMachine {

    public void start() {
        System.out.println("Please enter ColdDrinks you want 'pepsi' or 'cocacola'");
        Scanner userChoice = new Scanner(System.in);
        ColdDrinksFactory coldDrinksFactory = new ColdDrinksFactory();
        ColdDrinks coldDrinks = coldDrinksFactory.getColdDrinks(userChoice.nextLine());
        if (coldDrinks != null) {
            provideColdDrinks(coldDrinks);
        } else {
            System.out.println("Please enter ur choice");
        }
    }

    private void provideColdDrinks(ColdDrinks coldDrinks) {
        System.out.println("You Selected: " +  coldDrinks.getName());
        System.out.println("Its Price is: " + coldDrinks.getCost());
        System.out.println("It weights: " +  coldDrinks.getWeight());
    }
}
