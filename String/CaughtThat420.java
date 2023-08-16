import java.util.Scanner;

public class CatchThat420 {
    public static void main(String[]args){
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s=Integer.toString(n);
        if (n==420){
            System.out.println("Caught");
        }else {
            System.out.println("Escaped");
        }
    }
}
