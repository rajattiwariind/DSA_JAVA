import java.util.Scanner;
public class Fuel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Fuel and Distance:");
        int fuel = scanner.nextInt();
        int distance = scanner.nextInt();
        int required;
        System.out.println(required=fuel*distance);
        if(required<50){
            System.out.println("Go on");
        }else{
            System.out.println("Enough");
        }

    }
}
