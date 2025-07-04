package observerPattern.observer;

import observerPattern.observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {
    String emailId;
    StocksObservable observer;
    public EmailAlertObserverImpl(String emailId,StocksObservable observer){
        this.emailId=emailId;
        this.observer=observer;
    }

    @Override
    public void update() {
        sendMail(emailId,"Product is in Stock. Hurry!!!");
    }
    public void sendMail(String id,String msg){
        System.out.println("Email sent to "+id+" with Message: "+msg);
    }
}
