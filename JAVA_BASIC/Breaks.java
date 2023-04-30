import java.util.Scanner;
public class Brakes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Distance and time:");
        int distance= scanner.nextInt();
        int time = scanner.nextInt();
        int speed;
        System.out.println(speed=distance/time);
        if(speed>40){
            System.out.println("Apply Brake");
        }else{
            System.out.println("Keep going");
        }


    }
}
