package inheritance.Animals;

public class Main {

    public static void main(String[] args) {

                Cat kitty = new Cat();
                kitty.Name = "Michelle";
                kitty.eat();
                kitty.sayYourName();
                Breed british = new Breed();
                british.Name = "Churchill";
                british.breed = "British Shorthair";
                british.sayYourBreed();
                british.sayYourName();
    }


}
