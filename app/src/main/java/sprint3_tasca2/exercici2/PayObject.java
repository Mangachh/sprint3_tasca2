package sprint3_tasca2.exercici2;

public class PayObject implements IPayCallback{

    private String name;
    private double funds;

    public PayObject(final String name, double funds){
        this.name = name;
        this.funds = funds;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public void pay(double price) {
        System.out.println(String.format("%s está tramitando el pago de %.2f", this.name, price));
        funds -= price;
        System.out.println(String.format("Pago completado. Saldo disponible: %.2f", this.funds));                
    }
    
}
