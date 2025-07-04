package observerPattern;

import observerPattern.observable.IphoneStocksObservable;
import observerPattern.observer.EmailAlertObserverImpl;
import observerPattern.observer.MobileAlertObserverImpl;
import observerPattern.observer.NotificationAlertObserver;

public class Main {
    public static void main(String[] args){
        IphoneStocksObservable iphone=new IphoneStocksObservable();
        NotificationAlertObserver obj=new EmailAlertObserverImpl("abc@gmail.com",iphone);
        NotificationAlertObserver obj1=new MobileAlertObserverImpl("ABC",iphone);

        iphone.add(obj);
        iphone.add(obj1);
        iphone.setStockCount(70);
        iphone.setStockCount(0);
        iphone.setStockCount(9);
        int stock=iphone.getStockCount();
        System.out.println(stock);
    }
}
