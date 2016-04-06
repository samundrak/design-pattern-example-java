package designpatternsexample.factory;

/**
 *
 * @author samundra
 */
public class ColdDrinksFactory {

    public ColdDrinks getColdDrinks(String name) {
        ColdDrinks coldDrinks = null;
        if ("pepsi".equals(name)) {
            coldDrinks = new Pepsi();
        } else if ("cocacola".equals(name)) {
            coldDrinks = new CocaCola();
        } else {
            return null;
        }
        return coldDrinks;
    }
}
