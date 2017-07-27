package blog.javappu.creational.factorymethod;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by @ppu on 28-07-2017.
 */
public class AnimalFactoryTest {

    @Test
    public void testValidAnimal() {
        Animal animal = AnimalFactory.getAnimal("dog");
        assertEquals("bark", animal.speak());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidAnimal() {
        AnimalFactory.getAnimal("hello");
    }
}