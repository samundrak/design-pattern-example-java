package designpatternsexample.strategy;
/**
 * In computer programming, the strategy pattern (also known as the policy
 * pattern) is a software design pattern that enables an algorithm's behavior to
 * be selected at runtime. The strategy pattern. defines a family of algorithms,
 * encapsulates each algorithm, and. makes the algorithms interchangeable within
 * that family. - WikiPedia
 *
 * @author samundra
 */
interface StrategyPattern {

    String fly();
}

class canFly implements StrategyPattern {

    @Override
    public String fly() {
        return " i can fly anywhere";
    }
}

class cantFly implements StrategyPattern {

    @Override
    public String fly() {
        return "i cant fly anywhere, i can only jump";
    }

}
