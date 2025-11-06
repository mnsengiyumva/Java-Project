import java.util.ArrayList;

public class Truck extends Car{


    ArrayList<Car> allTrucks = new ArrayList<>();
    
    public Truck(String name, String id, String brand, String location, int year, int cost){
        
        super(name, id, brand, location, year, cost);
        
    }


    
}
