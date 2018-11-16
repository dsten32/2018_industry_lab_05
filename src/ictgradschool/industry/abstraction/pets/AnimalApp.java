package ictgradschool.industry.abstraction.pets;

/**
 * Main program.
 */
public class AnimalApp {

    public void start() {

        IAnimal[] animals = new IAnimal[3];

        // TODO Populate the pets array with a Bird, a Dog and a Horse.
        animals[0] = null;
        animals[1] = null;
        animals[2] = null;

        processAnimalDetails(animals);

    }

    private void processAnimalDetails(IAnimal[] list) {
        // TODO Loop through all the pets in the given list, and print their details as shown in the lab handout.
        // TODO If the animal also implements IFamous, print out that corresponding info too.
    }

    public static void main(String[] args) {
        new AnimalApp().start();
    }
}
