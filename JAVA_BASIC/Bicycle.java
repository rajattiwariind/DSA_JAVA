public class Bicycle {

    String name;
    int speed;
    int gears;
    String color;
    public static void main(String []args){
        Bicycle passionPro = new Bicycle();
        passionPro.color="Red";
        passionPro.name="PassionProXV";
        passionPro.gears=4;
        passionPro.speed=70;

        System.out.println("Name is " + passionPro.name);
        System.out.println("Color is "+ passionPro.color);
        System.out.println("Gear is " + passionPro.gears);
        System.out.println("Max Speed is " + passionPro.speed);
    }
}
