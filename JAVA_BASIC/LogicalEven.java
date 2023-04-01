import java.util.Scanner;
public class LogicalEven {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int one=scanner.nextInt();
        int two=scanner.nextInt();
        if(one%2==0 && two%2==0){
            System.out.println("Both");
        }else{
            System.out.println("No");
        }


    }
}
