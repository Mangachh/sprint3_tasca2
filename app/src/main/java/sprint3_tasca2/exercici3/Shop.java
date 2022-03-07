package sprint3_tasca2.exercici3;

public class Shop {
    
    private Exchange exchange;
    private static final String PRICE_FORMAT = "Precio en %s: %.2f";

    public Shop(final Exchange exchange){
        this.exchange = exchange;
    }

    public void showPrices(final String product, double price){
        System.out.println("Producto: " + product);
        this.printPrice("euros", price);

        double newCurr = this.exchange.exchangeTo("dollar", price);
        this.printPrice("dolares", newCurr);

        newCurr = this.exchange.exchangeTo("yen", price);
        this.printPrice("yens", newCurr);

        newCurr = this.exchange.exchangeTo("yuan", price);
        this.printPrice("yuans", newCurr);
        

    }

    private void printPrice(final String currency, double price){
        System.out.println(String.format(PRICE_FORMAT, currency, price));
    }

    
}
