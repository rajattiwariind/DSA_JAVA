import java.util.Scanner;

//Given two passwords print "Valid Password" if both the passwords are same//
public class ValidatePassword {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the password 1");
        String PasswordOne = scanner.nextLine();
        System.out.println("Enter the password 2");
        String PasswordTwo = scanner.nextLine();

        if(PasswordTwo.equals(PasswordOne));
        System.out.println("Valid Password");
    }
}
