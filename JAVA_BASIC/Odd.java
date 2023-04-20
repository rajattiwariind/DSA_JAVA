import java.util.Scanner;

public class odd {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();

        if(num % 2 ==1){
            System.out.println("Number is Odd");
        }
    }
}
