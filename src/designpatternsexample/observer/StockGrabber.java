/*
 */
package designpatternsexample.observer;

import java.util.ArrayList;

/**
 *
 * @author samundra
 */
public class StockGrabber implements Subject {

    double ibmPrice;
    double googlePrice;
    double applePrice;
    ArrayList<Observer> observers;

    public StockGrabber() {
        observers = new ArrayList<>();
    }

    @Override
    public void register(Observer o) {
        observers.add(o);

    }

    @Override
    public void unregister(Observer o) {
        int observerIndex = observers.indexOf(o);
        observers.remove(observerIndex);
    }

    @Override
    public void notifyObserver() {
        for (Observer o : observers) {
            o.update(ibmPrice, applePrice, googlePrice);
        }
    }

    public void setIbmPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
        notifyObserver();
    }

    public void setGooglePrice(double googlePrice) {
        this.googlePrice = googlePrice;
        notifyObserver();
    }

    public void setApplePrice(double applePrice) {
        this.applePrice = applePrice;
        notifyObserver();
    }

}
