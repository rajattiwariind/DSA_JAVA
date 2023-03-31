import java.util.Scanner;

public class CompareSevenNumber {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        int d=scanner.nextInt();
        int e=scanner.nextInt();
        int f=scanner.nextInt();
        int g=scanner.nextInt();
        int sum1;
        int sum2;
        sum1=(a+b)*c;
        sum2=(d+e+f+g);
        System.out.println(sum1>sum2);
    }
}
