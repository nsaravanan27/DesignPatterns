package blog.javappu.creational.factorymethod;

/**
 * Created by @ppu on 28-07-2017.
 */
public class Main {
    public static void main(String[] args) {
        Animal animal = AnimalFactory.getAnimal("lion");
        System.out.println(animal.speak());

        animal = AnimalFactory.getAnimal("dog");
        System.out.println(animal.speak());

        animal = AnimalFactory.getAnimal("cat");
        System.out.println(animal.speak());

        try {
            animal = AnimalFactory.getAnimal("test");
            System.out.println(animal.speak());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
