import java.util.Scanner;

public class greaternum{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the value for a and b");
        int a= scanner.nextInt();
        int b= scanner.nextInt();

        if(a>b){
            System.out.println("a is greater");
        } else if (b>a) {
            System.out.println("b is greater");

        }
    }
    }
