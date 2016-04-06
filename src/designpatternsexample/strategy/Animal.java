package designpatternsexample.strategy;

import designpatternsexample.strategy.StrategyPattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samundra
 */
public class Animal {
    
    String name;
    int weight;
    double height;
    int age;
    StrategyPattern fly;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal() {
    }
    
   public String tryToFly(){
        return fly.fly();
    }
    
   void setFlyingAbility(StrategyPattern fly){
       this.fly  = fly;
   }
}
