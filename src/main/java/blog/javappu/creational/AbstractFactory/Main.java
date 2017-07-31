package blog.javappu.creational.abstractfactory;

/**
 * Created by @ppu on 31-07-2017.
 */
public class Main {
    public static void main(String[] args) {
        AnimalFactory animalFactory = AnimalFactory.getAnimalFactory("sea");
        System.out.println(animalFactory.getClass().getName());
        Animal animal = animalFactory.getAnimal("octopus");
        System.out.println(animal.speak());

        animalFactory = AnimalFactory.getAnimalFactory("land");
        System.out.println(animalFactory.getClass().getName());
        animal = animalFactory.getAnimal("dog");
        System.out.println(animal.speak());

        String sound = AnimalFactory.getAnimalFactory("sea").getAnimal("shark").speak();
        System.out.println(sound);
    }
}
