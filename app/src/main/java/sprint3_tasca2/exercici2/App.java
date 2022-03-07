package sprint3_tasca2.exercici2;

public class App {

    public static void main(String[] args){
        PaymentPlatform s = new PaymentPlatform();

        PayObject paypal = new PayObject("Paypal", 25554);
        PayObject visa = new PayObject("VISA", 544872);
        PayObject bank = new PayObject("Mistery Bank", 1587);

        s.purchase("Zapatillas", 45.25, paypal);
        System.out.println();
        s.purchase("Botas verdes", 211.25, visa);
        System.out.println();
        s.purchase("Bambas rojas", 321.58, bank);
        System.out.println();
        s.purchase("Sandalias", 654.2, visa);
        System.out.println();
    }    
}
