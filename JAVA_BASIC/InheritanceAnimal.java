public class Animal {  //first part
    private String color;

    public Animal() {
        System.out.println("Animal class constructor called");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void speak() {
        System.out.println("Random sound");
    }
}

public class Cat extends Animal {  //second part

    public Cat() {
        System.out.println("Cat class constructor called");
    }

    @Override
    public void speak() {
        super.speak();
        System.out.println("Meow Meow");
    }
}

public class AnimalTestDrive {    //third part
    public static void main(String[] args) {
        Cat cat = new Cat(); // Create object of cat
        cat.setColor("White"); // Able to access setColor method even though its not implemented in Cat class
        cat.speak();
        System.out.println("Color of the cat is " + cat.getColor());
    }
}
