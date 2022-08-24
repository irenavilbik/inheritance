package OOP.Animals;

class Cat extends Animal {

    public void sayYourName (){
        System.out.println("Hi, my name is " +  Name + " and I come from " + getClass());
    }
}

class catsBreed extends Cat {
    public String breed;
    public void sayYourBreed() {
        System.out.println("And my breed is " + breed);
    }
}