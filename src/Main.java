import java.util.concurrent.TransferQueue;

public class Main{

    public static void main(String[] args){

//        NumberGuessingGame player = new NumberGuessingGame("MICO", 22, 70);
//        player.play();

        Truck gmcTruck = new Truck("GMC TUX", "012GMC", "GMCco", "USA", 2023, 80000);
        Truck fordTruck = new Truck("FORD MAX", "20FRD", "FORD", "USA", 2022, 90000);
        fordTruck.getLuxuryCars();
        gmcTruck.getLuxuryCars();
        System.out.println(gmcTruck.isLuxuryCar());

    }
}