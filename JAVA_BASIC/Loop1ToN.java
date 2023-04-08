import java.util.Scanner;

public class Loop1ToN {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=scanner.nextInt();
        for(int n=1; n<=num; n++){
            System.out.println(n);
        }

    }
}
