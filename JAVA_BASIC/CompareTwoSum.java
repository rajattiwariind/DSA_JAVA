import java.util.Scanner;

public class CompareTwoSum {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int one=scanner.nextInt();
        int two=scanner.nextInt();
        int three=scanner.nextInt();
        int four=scanner.nextInt();
        int five=scanner.nextInt();
        int six=scanner.nextInt();
        int sum1;
        int sum2;
        sum1=one+two;
        sum2=four+five;
        if(sum1>three && sum2>six){
            System.out.println("Yes");
        }else{
            System.out.println("NO");
        }
    }
}
