import java.util.Scanner;

public class DivisibleAgain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values:");
        int num = sc.nextInt();
        int k = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (i % k == 0){
                sum=sum+i;
            }

        }
        System.out.println(sum);

    }
}
