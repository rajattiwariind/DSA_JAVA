import java.util.Scanner;

public class EnoughFuelConsumption {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Number");
        int fuel=scanner.nextInt();
        int distance=scanner.nextInt();
        int required;
        System.out.println(required=fuel*distance);
        if(required>50){
            System.out.println("enough");
        }else{
            System.out.println("Go on");
        }
   
