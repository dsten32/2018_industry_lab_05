package ictgradschool.industry.abstraction.Supermarket;

import ictgradschool.Keyboard;

import java.util.List;


public class LocalStore {
    private String name;
    private String location;
    private double gpsLocation;
    private int maxProducts;
    private List inventory;


    public void start(){

        System.out.println("what sm name: ");
        setName(Keyboard.readInput());
        System.out.println("you set the sm name to be" + name);
        System.out.println("what sm loc: ");
        setLocation(Keyboard.readInput());
        System.out.println("you set the sm loc to be" + location);

    }



    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public void setGpsLocation(String gps){
//        make this bit take a single string argument that consists of two doubles comma separated. should probably have longitude and latitude be diff variables? how to apps deal with gps?
        // rough gps for Uni is -37.7850139,175.3187912
    }

    public void setMaxProducts(int maxProducts) {
        this.maxProducts = maxProducts;
    }

    public void setInventory(List inventory) {
        this.inventory = inventory;
    }

    public static void main(String[] args){
        LocalStore ls = new LocalStore();
        ls.start();
    }
}
