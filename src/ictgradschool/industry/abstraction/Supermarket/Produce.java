package ictgradschool.industry.abstraction.Supermarket;

import java.util.Date;

public class Produce extends Item implements Perishable {



    @Override
    public Date expDate() {
        return null;
    }

    @Override
    public double weight() {
        return 0;
    }

    public String getName(){
        return this.name;
    }

    public double getPrice(){
        return this.price;
    }

}
