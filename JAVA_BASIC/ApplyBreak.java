import java.util.Scanner;

public class ApplyBreaks {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int distance=scanner.nextInt();
        int time=scanner.nextInt();
        int speed;
        System.out.println(speed=distance/time);
        if(speed>40){
            System.out.println("Apply Brake");
        }else {
            System.out.println("Keep Going");
        }
    }

}
