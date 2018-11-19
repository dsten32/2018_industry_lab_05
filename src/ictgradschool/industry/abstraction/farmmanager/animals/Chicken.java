package ictgradschool.industry.abstraction.farmmanager.animals;

/**
 * This class defines a Cow. A cow has an initial value of $1000, and a maximum value of $1500.
 * The cost to feed a cow is $50.
 * You may modify this class according to the assignment.
 *
 * @author write your name and UPI here.
 */
public class Chicken extends Animal implements IProductionAnimal{
    private final int MAX_VALUE = 300;

    public Chicken() {
        value = 200;
    }

    public void feed() {
        if (value < MAX_VALUE) {
            value = value + (MAX_VALUE-value)/2;
        }
    }

    public int costToFeed() {
        return 3;
    }

    public String getType() {
        return "Chicken";
    }

    public String toString() {
        return getType() + " - $" + value;
    }

    @Override
    public boolean harvestable() {
        return true;
    }

    @Override
    public int harvest() {
        return 5;
    }
}
