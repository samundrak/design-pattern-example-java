package designpatternsexample.strategy;

import designpatternsexample.strategy.canFly;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samundra
 */
public class Bird extends Animal {
    
    public Bird() {
        super();
        setName("Tweety");
        setFlyingAbility(new canFly());
    }
    
}
