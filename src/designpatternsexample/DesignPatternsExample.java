/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternsexample;

import designpatternsexample.factory.VendorMachine;
import designpatternsexample.observer.StockGrabber;
import designpatternsexample.observer.StockObserver;
import designpatternsexample.strategy.Dog;
import designpatternsexample.strategy.Animal;
import designpatternsexample.strategy.Bird;

/**
 *
 * @author samundra
 */
public class DesignPatternsExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        factoryDesignPattern();
    }

    static void stategyDesignPattern() {
        //        Strategy Pattern Check Codes
//        Animal dog = new Dog();
//        Animal bird = new Bird();
//        System.out.println("i am " + dog.getName() + " " +  dog.tryToFly());
//        System.out.println("i am " + bird.getName() + " " +  bird.tryToFly());
    }

    static void observerDesignPattern() {
        //Observer Design pattern
//        StockGrabber stockGrabber = new StockGrabber();
//        StockObserver o1 = new StockObserver(stockGrabber);
//        stockGrabber.setApplePrice(0.11f);
//        stockGrabber.setGooglePrice(0.12f);
//        stockGrabber.setIbmPrice(0.13f);

    }

    static void factoryDesignPattern(){
//        Factory pattern is one of most used design pattern in Java. This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.

//In Factory pattern, we create object without exposing the creation logic to the client and refer to newly created object using a common interface.
        new VendorMachine().start();
    }
}
