

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

import java.util.HashMap;


class Shoes{

    public String brandName;
    public String modelNumber;
    public int productionYear;


    public Shoes(String name, String model, int year){
        this.brandName = name;
        this.modelNumber = model;
        this.productionYear = year;

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


class Nike extends Shoes {
    int category;

    ArrayList<String> names = new ArrayList<String>();

    public Nike(String name, String model, int year, int categoryType){
        super(name, model, year);
        this.category= categoryType;
    }



}



public class OOP{

    public static void main(String[] args){


        Nike nikeShoes = new Nike("AirMax", "AIR30021", 2020, 130);

        System.out.println(nikeShoes.brandName);



    }
}