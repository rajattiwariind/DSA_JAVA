import java.util.Scanner;

public class SayHello1 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=scanner.next();
        String a="Hello";
        System.out.println(a+" "+name);
    }
}
