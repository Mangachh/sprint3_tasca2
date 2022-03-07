package sprint3_tasca2.exercici1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;

public class Agent {

    private HashSet<IMarketChange> notifications;
    private double currentValue;
    private double lastValue;

    public Agent(){
        this.currentValue = 0;
        this.lastValue = 0;
    }

    public Agent(double currentValue, double lastValue){
        this.currentValue = currentValue;
        this.lastValue = lastValue;
    }
    {
        this.notifications = new HashSet<IMarketChange>();
    }

    public void addToNotifications(IMarketChange toNotify){
        try{
            this.notifications.add(toNotify);
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }

    public void removeFromNotifications(IMarketChange toNotify){
        try{
            this.notifications.remove(toNotify);
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }

    public void changeCurrentValue(double newValue){
        System.out.println("Oh no! La bolsa ha cambiado de valor! Tengo que avisar a las agencias que me han contratado!");
        this.lastValue = this.currentValue;
        this.currentValue = newValue;
        this.notifyChanges();
    }

    public double getCurrentValue(){
        return this.currentValue;
    }

    private void notifyChanges(){
        double difference = this.currentValue - this.lastValue;
        this.notifications.forEach(x -> x.notifyChange(difference, this.currentValue));
    }
    
}
