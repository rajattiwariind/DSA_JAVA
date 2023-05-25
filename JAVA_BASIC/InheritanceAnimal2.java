public class Animal {
    private String color;
    private String Type;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getType(){
        return Type;
    }
    public void setType(String Type){
        this.Type = Type;
    }
}

public class Dog extends Animal {

    public void bark(){
        System.out.println("Bow Bow");
    }
}


public class AnimalTestDrive {
    public static void main(String [] args){
        Dog dog = new Dog();
        dog.setColor("Brown");
        dog.setType("Mammals");
        System.out.println(dog.getColor());
        System.out.println(dog.getType());
        dog.bark();
    }
}
