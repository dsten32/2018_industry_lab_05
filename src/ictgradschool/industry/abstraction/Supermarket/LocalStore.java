package ictgradschool.industry.abstraction.Supermarket;

import ictgradschool.Keyboard;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;


public class LocalStore {
    private String name;
    private String location;
    private double gpsLocation;
    private int maxProducts;
    private List inventory;


    public void start(){

        System.out.print("what sm name: ");
        setName(Keyboard.readInput());
        System.out.println("you set the sm name to be" + name);
        System.out.print("what sm loc: ");
        setLocation(Keyboard.readInput());
        System.out.println("you set the sm loc to be" + location);
        System.out.print("what sm maxprod: ");
        setMaxProducts(Integer.parseInt(Keyboard.readInput()));
        System.out.println("you set the sm maxprod to be" + location);

        System.out.println("add a prod");
        inventory=addInventory();
        System.out.print("you added:");
        System.out.print(inventory);

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

    public List addInventory(){
        List newProd = new ArrayList();
//new product name..
        System.out.print("new prod name: ");
        String eName=Keyboard.readInput();
        Pair<String,String> pName=new Pair<>("Name:",eName);
        newProd.add(pName);
//new product price..
        System.out.print("new prod price: ");
        double ePrice=Double.parseDouble(Keyboard.readInput());
        Pair<String,Double> pPrice=new Pair<>("Price:",ePrice);
        newProd.add(pPrice);
//new product quantity..
        System.out.print("new prod quantity: ");
        int eQuant=Integer.parseInt(Keyboard.readInput());
        Pair<String,Integer> pQuant=new Pair<>("Quant:",eQuant);
        newProd.add(pQuant);


        return newProd;
    }

    public void setInventory(List inventory) {
        this.inventory = inventory;
    }

    public static void main(String[] args){
        LocalStore ls = new LocalStore();
        ls.start();
    }
}
