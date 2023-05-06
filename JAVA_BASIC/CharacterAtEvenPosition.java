import java.util.Scanner;

public class CharacterAtEven {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scanner.nextInt();
        String name = scanner.next();
        String str = name;
        for (int i = 0; i <= str.length() - 1; i++) {
            if (i % 2 == 0) {
                System.out.println(str.charAt(i));
            }
        }
    }
}
