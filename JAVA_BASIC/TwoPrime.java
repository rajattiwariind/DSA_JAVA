import java.util.Scanner;

public class TwoPrime {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int a  = scanner.nextInt();
        int b  = scanner.nextInt();
        int count = 0;
        
        int n = a;
        if(n < b) {
            n = b;
        }
        for(int i = 2; i<=n; i++){
            
                if(a%i==0){
                   count++;
                }
                if (b%i == 0) {
                    count++;
                }
            
           
        }
        
         if(count == 2){
                System.out.println("True");
            }else{
                System.out.println("False");
            }
    }
}
