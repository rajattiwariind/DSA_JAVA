import java.util.Scanner;

public class SumTwoEquation1 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int X=(a*5)+(b*3);
        int Y=(a*7)+(b*4);
        System.out.println(X+Y);
    }
}
