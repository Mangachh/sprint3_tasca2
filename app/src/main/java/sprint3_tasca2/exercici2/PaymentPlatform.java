package sprint3_tasca2.exercici2;

public class PaymentPlatform {
    

    public void purchase(final String product, double price, IPayCallback callback){
        System.out.println(String.format("Datos de la compra:\n\tProducto: %s\n\tPrecio: %.2f", product, price));
        // callback
        callback.pay(price);
    }
}
