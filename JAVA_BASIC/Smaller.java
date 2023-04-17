import java.util.Scanner;

public class Smaller {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the value of a and b");
        int a =scanner.nextInt();
        int b =scanner.nextInt();

        if(a<b){
            System.out.println("a is small");
        }
        else {
            System.out.println("b is small");
        }
    }
}
