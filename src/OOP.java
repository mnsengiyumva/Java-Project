

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

import java.util.HashMap;


class Brands{

    String brandName;
    String modelNumber;
    int productionYear;


    public Brands(String name, String model, int year){
        this.brandName = name;
        this.modelNumber = model;
        this.productionYear = year;

    }

    String getBrandName(){
        return this.brandName;
    }
    void setBrandName(String newName){
        this.brandName = newName;
    }

    void setProductionYear(int newYear){
        this.productionYear = newYear;
    }

    void writeNamesInFile(){
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




public class OOP{
    public static void main(String[] args){

    }
}