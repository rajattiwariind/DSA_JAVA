import java.util.Scanner;
public class CheckVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        String string = sc.nextLine();
        System.out.print(test(string));
    }

    public static boolean test(String input) {
        String str_vowels = "aeiou";
        String phrase = input.toLowerCase();
        for (int i = 0; i < phrase.length(); i++) {
            if (str_vowels.indexOf(phrase.charAt(i)) == -1)
                return false;
        }
        return true;
    }
}
