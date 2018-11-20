package ictgradschool.industry.abstraction.Supermarket;

import java.util.List;

public class LocalStore {
    private String name;
    private String location;
    private int maxProducts;
    private List inventory;


    public void start(){

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
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
