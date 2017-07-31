package blog.javappu.creational.abstractfactory;

/**
 * Created by @ppu on 31-07-2017.
 */
public class SeaAnimalFactory extends AnimalFactory {
    @Override
    public Animal getAnimal(String animalType) {
        Animal animal;
        switch (animalType) {
            case "shark":
                animal = new Shark();
                break;
            case "octopus":
                animal = new Octopus();
                break;
            default:
                throw new IllegalArgumentException();
        }
        return animal;
    }
}
