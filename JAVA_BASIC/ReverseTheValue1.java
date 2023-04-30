import java.util.Scanner;

public class ReverseTheValue1 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value");
        int num=scanner.nextInt();
        int reversed=0;
            while (num!=0){
                int digit =num%10;
                reversed=reversed*10+digit;
                num/=10;

            }
        System.out.println("Reversed:"+reversed);
    }
}
