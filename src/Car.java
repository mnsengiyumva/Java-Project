
import java.util.ArrayList;
import java.util.HashMap;


public class Car{

    private String carName;
    private String carID;
    private String carBrand;
    private int productionYear;
    private String productionLocation;
    private int carCost;

    private ArrayList<String> allCars;
    private HashMap<String, Integer> carNamesAndYear;
    private HashMap<String, Integer> carAndCost;

    private HashMap<String, Integer> luxuryCars;

    public Car(String name, String id, String brand, String location, int year, int cost){
        this.carName = name;
        this.carBrand = brand;
        this.carCost = cost;
        this.carID = id;
        this.productionLocation = location;
        this.productionYear = year;

        this.allCars = new ArrayList<>();
        this.carNamesAndYear = new HashMap<>();
        this.carAndCost = new HashMap<>();
        this.luxuryCars = new HashMap<>();

    }

    public void setCarCost(int newCost){
        this.carCost = newCost;

    }

    public void setProductionYear(int newYear){

        this.carCost = newYear;
    }

    public String getCarNames(){
        return this.carName;
    }

    public ArrayList<String> getAllCars(){
        this.allCars.add(this.carName);
        return this.allCars;
    }

    /*** returns a dictionary of car names and the year they were produced
     *
     * @return a hashmap
     */

    public HashMap<String, Integer> getCarNamesAndYear(){
        this.carNamesAndYear.put(this.carName, this.productionYear);
        return carNamesAndYear;
    }

    /*** The luxury cars are the cars with the cost above $20000, and they are produced al least in 2020
     *
     * @return the hashmap of those cars
     */

    public HashMap<String, Integer> getLuxuryCars(){

        if(this.carCost>20000 && this.productionYear >= 2020){
            this.luxuryCars.put(this.carName, this.carCost);
        }

        return this.luxuryCars;

    }

    public boolean isLuxuryCar(){

        if (this.carCost >20000 && this.productionYear >=2020){
            return true;
        }
        return false;
    }





}