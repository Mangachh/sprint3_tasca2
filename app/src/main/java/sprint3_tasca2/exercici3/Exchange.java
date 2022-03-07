package sprint3_tasca2.exercici3;

public class Exchange {
    
    public double exchangeTo(final String currency, double euro){
        double value = euro;
        switch(currency){
            case "dollar":
                value = euro * 1.09;
                break;
            case "yen":
                value = euro * 125.48;
                break;
            case "yuan":
                value = euro * 6.87;
                break;
        }

        return value;
    }
}
