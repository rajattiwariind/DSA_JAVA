import java.util.Scanner;

public class MultiplesOf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a limit");
        int limit = sc.nextInt();
        divisible(limit);

    }

    public static int divisible(int limit) {
        for (int i = 1; i <= limit; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
        return limit;
    }
}
