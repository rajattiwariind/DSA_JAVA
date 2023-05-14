public class Bicycle {

    String name;
    int speed;
    int gears;
    String color;
    boolean bool;
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


            Bicycle RoyalEnfield = new Bicycle();
            RoyalEnfield.color="Blue";
            RoyalEnfield.name="Royal005";
            RoyalEnfield.gears=6;
            RoyalEnfield.speed=110;

        System.out.println("Name is " + RoyalEnfield.name);
        System.out.println("Color is " + RoyalEnfield.color);
        System.out.println("Gear is " + RoyalEnfield.gears);
        System.out.println("Max Speed is " + RoyalEnfield.speed);

        if (RoyalEnfield==passionPro){
            System.out.println("Both are equal");

        }else {
            System.out.println("Object are not equal");
        }
    }
}
