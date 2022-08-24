package OOP.Animals;

import OOP.Cat;

public class Breed extends Cat {
    public String breed;

    public void sayYourBreed() {
        System.out.println("And my breed is " + breed + " and I come from " + getClass());
    }
}
