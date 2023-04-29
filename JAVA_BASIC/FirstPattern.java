import java.util.Scanner;

public class FirstPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        String s = "*";
        for (int i = 1; i <= num; i++) {
                for (int j =1; j<=num; j++){
                    System.out.print(s+" ");
                }
            System.out.println();
        }

    }
}
