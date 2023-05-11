import java.util.Scanner;

public class PrintMultiplies {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Limit");
        int limit = scanner.nextInt();
        divisible(limit);
    }
    public static void divisible(int limit){
        for (int i=0; i<=limit; i++){
            if (i%3==0){
                System.out.println(i);
            }
        }
    }
}
