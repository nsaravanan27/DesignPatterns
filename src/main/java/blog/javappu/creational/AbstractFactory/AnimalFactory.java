package blog.javappu.creational.AbstractFactory;

/**
 * Created by @ppu on 31-07-2017.
 */
public abstract class AnimalFactory {
    public abstract Animal getAnimal(String animalType);

    public static AnimalFactory getAnimalFactory(String factoryType) {
        AnimalFactory animalFactory;
        switch (factoryType) {
            case "sea" :
                animalFactory =  new SeaAnimalFactory();
                break;
            case "land" :
                animalFactory = new LandAnimalFactory();
                break;
            default:
                throw new IllegalArgumentException();
        }
        return animalFactory;
    }
}
