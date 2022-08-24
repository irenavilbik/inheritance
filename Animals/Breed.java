package inheritance.Animals;


public class Breed extends Cat {
    public String breed;

    public void sayYourBreed() {
        System.out.println("My breed is " + breed + " I am created in " + getClass());
    }
}
