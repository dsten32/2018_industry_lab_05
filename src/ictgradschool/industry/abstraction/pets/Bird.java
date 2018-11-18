package ictgradschool.industry.abstraction.pets;

/**
 * Represents a Bird.
 *
 * TODO Correctly implement these methods, as instructed in the lab handout.
 */
public class Bird implements IAnimal {

    @Override
    public String sayHello() {

        return "tweet tweet";
    }

    @Override
    public boolean isMammal() {

        return false;
    }

    @Override
    public String myName() {

        return "Tweety";
    }

    @Override
    public int legCount() {

        return 2;
    }
}
