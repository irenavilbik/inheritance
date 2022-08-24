package OOP.Animals;

public class Main {

    public static void main(String[] args) {

                Animal dog = new Animal();
                dog.Name = "Dollar";
                Cat kitty = new Cat();
                kitty.Name = "Michelle";
                kitty.eat();
                dog.eat();
                kitty.sayYourName();
                Breed british = new Breed();
                british.Name = "Churchill";
                british.breed = "British Shorthair";
                british.sayYourBreed();
                british.sayYourName();




    }


}
