

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

import java.util.HashMap;


class Adidas extends Shoes{

    String shoeName;

    public Adidas(String name, String model, int year, int cost, String shoe){

        super(name, model, year,cost);

        this.shoeName =shoe;
    }

    public void costIncrement(int newPrice){
        if (this.brandCost<100){
            this.brandCost += newPrice;
        }
    }
}


class Nike extends Shoes {
    int category;



    ArrayList<String> names = new ArrayList<String>();
    ArrayList<Integer> prices = new ArrayList<Integer>();

    public Nike(String name, String model, int year, int cost, int categoryType){
        super(name, model, year, cost);
        this.category= categoryType;

    }

    public void brandNames(){
        names.add(this.brandName);
    }


    public void nikePrices(){

        this.prices.add(this.brandCost);

    }




}



public class OOP{

    public static void main(String[] args){


        Nike nikeShoes = new Nike("AirMax", "AIR30021", 2020, 130, 250);

        Adidas adidas1 = new Adidas("Samba", "sam222", 2023, 150, "Samba collections");


        System.out.println(adidas1.getCost());
        adidas1.setBrandName("Boots");
        System.out.println((adidas1.getBrandName()));

        System.out.println(nikeShoes.brandName);



    }
}