package designpatternsexample.strategy;

import designpatternsexample.strategy.cantFly;
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
public class Dog extends Animal {

    public Dog() {
        super();
        setName("Doggie");
        StrategyPattern fly = new cantFly();
        setFlyingAbility(fly);
    }

}
