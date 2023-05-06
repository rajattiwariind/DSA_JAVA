import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Vowels {
    public static void main( String args[] ) {
        String regex = "[aeiou]";
        System.out.println("Enter input string: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        //Compiling the regular expression
        Pattern.compile(regex);
        //Compiling the regular expression
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if(matcher.find()) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
