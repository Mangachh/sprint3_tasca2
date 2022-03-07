package sprint3_tasca2.exercici3;

public class App {
    
    public static void main(String[] args){
        Shop s = new Shop(new Exchange());

        s.showPrices("Mesa pocha", 225.45);
        System.out.println();
        s.showPrices("Silla coja", 142.36);
        System.out.println();
        s.showPrices("Cojín usado", 21.21);
        System.out.println();
        s.showPrices("Sofá manchado", 587.45);
        System.out.println();
        s.showPrices("Manta elitista", 988.88);
        System.out.println();
        s.showPrices("Nariz de pega", 65);
        System.out.println();
    }
}
