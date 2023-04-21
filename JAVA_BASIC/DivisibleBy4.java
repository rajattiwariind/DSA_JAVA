import java.util.Scanner;

public class DivisibleBy4 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=scanner.nextInt();
        if(a%4==0){
            System.out.println("yes");

        }else{
            System.out.println("No");
        }
    }
}
