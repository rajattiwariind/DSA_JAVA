import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // a is the first number
        int b = sc.nextInt(); // b is the second number
        int c = sc.nextInt();// c is the third number
        int output=a*a+b*b+c*c;
        System.out.println(output);
    }
}
