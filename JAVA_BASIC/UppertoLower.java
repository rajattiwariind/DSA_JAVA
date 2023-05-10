import java.util.Scanner;

public class UppertoLower {
    public static void main(String  []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a char");
        char ch=sc.next().charAt(0);
        upperToLower(ch);
    }
    public static void upperToLower(char ch){
        char out=(char) (ch + 32);
        System.out.println(out);
    }
}
