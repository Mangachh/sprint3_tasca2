/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sprint3_tasca2.exercici1;

public class App {

    public static void main(String[] args) {
        //creamos agente
        Agent agent = new Agent();

        //creamos unas cuantas agencias
        Agency age1 = new Agency("Agencia_1");        
        Agency age2 = new Agency("Agencia_2");
        Agency age3 = new Agency("Agencia_3");
        Agency age4 = new Agency("Agencia_4");

        //suscribimos
        agent.addToNotifications(age1);
        agent.addToNotifications(age2);
        agent.addToNotifications(age3);
        agent.addToNotifications(age4);

        //hacemos un par de cambios
        playWithMarket(10, agent);
        playWithMarket(10.254, agent);
        playWithMarket(11.45887, agent);
        playWithMarket(2.2224, agent);
        playWithMarket(2.21, agent);
        playWithMarket(1.2224, agent);
        
        

        
    }

    private static void playWithMarket(double newValue, final Agent agent){
        System.out.println(String.format("¡Vamos a jugar con la bolsa! ¡El valor de la bolsa es: %.4f!", newValue));
        System.out.println("Vamos a notificar al agente!!!");
        agent.changeCurrentValue(newValue);
        System.out.println();
    }
}
