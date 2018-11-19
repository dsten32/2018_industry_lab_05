package ictgradschool.industry.abstraction.farmmanager.animals;

/**
 * This class defines a Cow. A cow has an initial value of $1000, and a maximum value of $1500.
 * The cost to feed a cow is $50.
 * You may modify this class according to the assignment.
 *
 * @author write your name and UPI here.
 */
public class Unicorn extends Animal {
    private final int MAX_VALUE = 20000;

    public Unicorn() {
        value = 10000;
    }

    public void feed() {
        if (value < MAX_VALUE) {
            value += 1000;
        }
    }

    public int costToFeed() {
        return 200;
    }

    public String getType() {
        return "Unicorn";
    }

    public String toString() {
        return getType() + " - $" + value;
    }
}
