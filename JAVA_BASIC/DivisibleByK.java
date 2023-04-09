import java.util.Scanner;

public class DivisibleByK {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=scanner.nextInt();
        int k=scanner.nextInt();
        for (int i=1; i<=num; i++){
            if(i%k==0){
                System.out.println(i);
            }
        }
    }
}
