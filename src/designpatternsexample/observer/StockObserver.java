/*
 */
package designpatternsexample.observer;

/**
 *
 * @author samundra
 */
public class StockObserver implements Observer {

    public double ibmPrice, applePrice, googlePrice;
    public static int observerIDTracker = 0;
    private int observerID;
    private Subject stockGrabber;

    public StockObserver(Subject subject) {
        this.stockGrabber = subject;
        this.observerID = ++observerIDTracker;
        System.out.println("New Observer ID " + observerID);
        stockGrabber.register(this);
    }

    @Override
    public void update(double ibmPrice, double applePrice, double googlePrice) {
        this.ibmPrice = ibmPrice;
        this.applePrice = applePrice;
        this.googlePrice = googlePrice;
        printThePrices();
    }

    private void printThePrices() {
        System.out.println(observerID + "IBM" + ibmPrice);
        System.out.println(observerID + "Google" + googlePrice);
        System.out.println(observerID + "Apple" + applePrice);
    }

}
