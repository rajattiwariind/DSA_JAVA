import java.util.Scanner;

public class BreakingRecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 264;
        System.out.println(n);
        int m = sc.nextInt();
        if (m < n) {
            System.out.println("Not yet");
        }if (m > n) {
                    System.out.println("Wao");
                } else if (m == n) {
                    System.out.println("Broken");
                }
    }
}
