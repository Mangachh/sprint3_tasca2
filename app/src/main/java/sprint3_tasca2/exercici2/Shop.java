package sprint3_tasca2.exercici2;

public class Shop {
    

    public void purchase(final String product, double price, IPayCallback callback){
        System.out.println(String.format("Datos de la compra:\nProducto: %s\nPrecio: %.2f", product, price));
        // callback
        callback.pay(price);
    }
}
