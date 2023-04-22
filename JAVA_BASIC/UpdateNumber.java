import java.util.Scanner;
public class UpdateNumber {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any 2 number");
        int a= scanner.nextInt();
        int b= scanner.nextInt();

        if(a>b){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        System.out.println("Enter 3rd number");
        int c= scanner.nextInt();
        int output=a+c;
        if(a+c>b){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

    }
}
