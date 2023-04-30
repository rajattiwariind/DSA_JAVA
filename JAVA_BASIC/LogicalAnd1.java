import java.util.Scanner;

public class LogicalAnd1 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        if(a>15 && b>20){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

    }
}
