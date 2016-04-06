/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternsexample;

import designpatternsexample.builder.OldRobotBuilder;
import designpatternsexample.builder.Robot;
import designpatternsexample.builder.RobotBuilder;
import designpatternsexample.builder.RobotEngineer;
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
//        factoryDesignPattern();
        builderDesignPattern();
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

    static void factoryDesignPattern() {
        //Factory Design Pattern
        new VendorMachine().start();
    }

    static void builderDesignPattern() {
        RobotBuilder oldStyleRobot = new OldRobotBuilder();
        RobotEngineer robotEngineer = new RobotEngineer(oldStyleRobot);

        robotEngineer.makeRobot();

        Robot firstRobot = robotEngineer.getRobot();
        System.out.println("Robot is built");
        System.out.println("Robot Head Type" + firstRobot.getRobotHead());
        System.out.println("Robot Torso Type" + firstRobot.getRobotTorso());
        System.out.println("Robot Arms Type" + firstRobot.getRobotArms());
        System.out.println("Robot Legs Type" + firstRobot.getRobotLegs());
    }
}
