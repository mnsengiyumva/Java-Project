import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class Shoes{

    public String brandName;
    public String modelNumber;
    public int productionYear;
    int brandCost;


    public Shoes(String name, String model, int year, int cost){
        this.brandName = name;
        this.modelNumber = model;
        this.productionYear = year;
        this.brandCost = cost;

    }

    public String getBrandName(){
        return this.brandName;
    }
    public void setBrandName(String newName){
        this.brandName = newName;
    }

    public void setProductionYear(int newYear){
        this.productionYear = newYear;
    }

    public int getCost(){
        return this.brandCost;
    }

    public void writeNamesInFile(){
        try{

            HashMap<String, String> namesAndModel = new HashMap<String, String>();
            namesAndModel.put(this.brandName, this.modelNumber);
            FileWriter myFile = new FileWriter("BrandNames.txt");

            myFile.write("This is a HashMap for "+this.brandName);

            myFile.write(String.valueOf(namesAndModel));

            myFile.close();

        }
        catch(IOException e){
            System.out.println("An error has occurred while writing the file");
            e.printStackTrace();
        }


    }

}
