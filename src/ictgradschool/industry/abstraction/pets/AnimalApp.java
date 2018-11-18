package ictgradschool.industry.abstraction.pets;

/**
 * Main program.
 */
public class AnimalApp {

    public void start() {

        IAnimal[] animals = new IAnimal[3];

        // TODone Populate the pets array with a Bird, a Dog and a Horse.
        animals[0] = new Bird();
        animals[1] = new Dog();
        animals[2] = new Horse();

        processAnimalDetails(animals);

    }

    private void processAnimalDetails(IAnimal[] list) {
        // TODO Loop through all the pets in the given list, and print their details as shown in the lab handout.
        // TODO If the animal also implements IFamous, print out that corresponding info too.
        for (int i = 0; i <list.length ; i++) {
            System.out.println(list[i].myName() + " the " + list[i].getClass() + " says " + list[i].sayHello() +"\n Did I forget to tell you that I have " + list[i].legCount() + " legs.");
            if (list[i] instanceof IFamous){
                IFamous famousAnimal = (IFamous) list[i];
                System.out.println("This is a famous name of my animal type: " + famousAnimal.famous());
            }

        }
    }

    public static void main(String[] args) {
        new AnimalApp().start();
    }
}
