package blog.javappu.creational.factorymethod;

/**
 * Created by @ppu on 28-07-2017.
 */
public class AnimalFactory {
    public static Animal getAnimal(String animalName){
        Animal animal;
        switch (animalName) {
            case "dog":
                animal = new Dog();
                break;
            case "cat":
                animal = new Cat();
                break;
            case "lion":
                animal = new Lion();
                break;
            default:
                throw new IllegalArgumentException("Invalid animal name");
        }
        return animal;
    }
}
