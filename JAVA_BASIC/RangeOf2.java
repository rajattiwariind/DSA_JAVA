import java.util.Scanner;

public class RangeOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int left = sc.nextInt();
        int right = sc.nextInt();
        System.out.println(left);
        for (int i = 1; i <= right; i++) {
            if (left+left<= right) {
             left =left+left;
             System.out.println(left);

            }
        }

    }
}
