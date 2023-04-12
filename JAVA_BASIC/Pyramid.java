import java.util.Scanner;

public class Pyramid {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=scanner.nextInt();

        for(int i=0; i<n; i++){

            for(int j=n-i; j>1; j--){
                System.out.print(" ");
            }
            for(int k=0; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
