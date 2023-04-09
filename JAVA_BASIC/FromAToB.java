import java.util.Scanner;

public class FromAToB {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int max=scanner.nextInt();
        int min=scanner.nextInt();
        for(int n=min; n<max; n++){
            System.out.println(n);
        }
    }
}
