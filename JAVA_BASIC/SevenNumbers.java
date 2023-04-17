import java.util.Scanner;

public class SevenNumbers {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int A=scanner.nextInt();
        int B=scanner.nextInt();
        int C=scanner.nextInt();
        int D=scanner.nextInt();
        int E=scanner.nextInt();
        int F=scanner.nextInt();
        int G=scanner.nextInt();
        System.out.println((A+B+C)*(D+E+F+G));
    }
}
