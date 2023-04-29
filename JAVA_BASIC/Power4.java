import java.util.Scanner;

public class Power4 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=scanner.nextInt();
        num=num*num*num*num;
        System.out.println(num);
    }
}
