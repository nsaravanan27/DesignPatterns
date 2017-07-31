package blog.javappu.creational.abstractfactory;

/**
 * Created by @ppu on 31-07-2017.
 */
public class LandAnimalFactory extends AnimalFactory {
    @Override
    public Animal getAnimal(String animalType) {
        Animal animal;
        switch (animalType){
            case "dog":
                animal = new Dog();
                break;
            case "cat":
                animal = new Cat();
                break;
            default:
                throw new IllegalArgumentException();
        }
        return animal;
    }
}
