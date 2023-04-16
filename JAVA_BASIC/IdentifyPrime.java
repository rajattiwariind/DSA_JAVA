import java.util.Scanner;

public class IdentifyPrime {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=scanner.nextInt();
        if(num%1==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
