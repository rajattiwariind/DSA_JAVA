import java.util.Scanner;

public class Concat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any String:");
        String start = sc.next();
        String end = sc.next();
        String concat = start.concat(end);
        System.out.println(concat);
    }
}
