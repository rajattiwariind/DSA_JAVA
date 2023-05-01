import java.util.Scanner;

public class InvertedL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        for (int i=0; i<num; i++) {
            for (int j=0; j<num; j++) {
                if (i==0 || j < num - (num-1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("");
                }
            }
            System.out.println();
        }
    }
}
