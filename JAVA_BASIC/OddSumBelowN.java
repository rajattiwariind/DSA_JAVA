import java.util.Scanner;

public class OddSumBelowN {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=scanner.nextInt();
        int sum=0;
        for(int n=1; n<=num; n++){
            if(n%2!=0){
                sum+=n;
            }
        }
        System.out.println(sum);
    }
}
