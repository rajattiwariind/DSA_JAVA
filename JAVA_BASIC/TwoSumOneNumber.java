import java.util.Scanner;

public class TwoSumOneNumber {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int one=scanner.nextInt();
        int two=scanner.nextInt();
        int three=scanner.nextInt();
        int four=scanner.nextInt();
        int five=scanner.nextInt();
        int sum1;
        int sum2;
        sum2 = three + four;
        sum1 = one + two;
        if (sum1 > five && sum2 > five) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
