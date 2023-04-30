import java.util.Scanner;

public class DivisibleBy5Again {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=scanner.nextInt();
        if(num%5==0){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
