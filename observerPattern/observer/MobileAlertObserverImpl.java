package observerPattern.observer;

import observerPattern.observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
    String userName;
    StocksObservable observer;
    public MobileAlertObserverImpl(String userName,StocksObservable observer){
        this.userName=userName;
        this.observer=observer;
    }

    @Override
    public void update() {
        sendMail(userName,"Product is in Stock. Hurry!!!");
    }
    public void sendMail(String id,String msg){
        System.out.println("Message sent to "+id+" with Message: "+msg);
    }
}
