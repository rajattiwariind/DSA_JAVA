import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        for (int j=1;j<=num; j++){
            String res = "";
            for (int k=1;k<=num; k++) {
                res = res + k;
                if (k < num) {
                    res = res + " ";
                }
            }
            System.out.println(res);

        }
    }
}
