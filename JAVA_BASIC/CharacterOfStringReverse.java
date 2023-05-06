import java.util.Scanner;

public class CharacterOfStringReverse {
    public static void main(String args[]) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scanner.nextInt();
        String name =scanner.next();
        String Reverse = name;
        for(int i=Reverse.length()-1; i>=0; i--) {
            System.out.println(Reverse.charAt(i));
        }
    }
}
