package observerPattern.observable;

import observerPattern.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneStocksObservable implements StocksObservable {

    List<NotificationAlertObserver> list = new ArrayList<>();
    int stockCount=0;

    @Override
    public void add(NotificationAlertObserver observer) {
        list.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        list.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationAlertObserver observer:list){
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStockCount) {
        if(stockCount==0){
            notifySubscribers();
        }
        stockCount=newStockCount;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
