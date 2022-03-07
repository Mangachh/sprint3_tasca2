package sprint3_tasca2.exercici1;

public class Agency implements IMarketChange {

    private String name;

    public Agency(final String name) {
        this.name = name;
    }

    // Podríamos complicar el código en demasia, pero creo que mostrando un
    // mensaje quedará claro.
    @Override
    public void notifyChange(double difference, double currentValue) {
        System.out.println(String.format("La agencia %s ha recibido los cambios en la bolsa:\n\tvariación: %.4f\n\tvalor actual: %.4f", this.name, difference, currentValue));
    }
}
