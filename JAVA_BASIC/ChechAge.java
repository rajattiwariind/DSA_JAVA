import java.util.Scanner;

//Given the year of birth if the age is between 13 and 19 (both included) print Teenage//
public class CheckAge {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the current age");
        int currentYear=scanner.nextInt();
        System.out.println("Enter the year of birth");
        int yearOfBirth=scanner.nextInt();

        int age=currentYear-yearOfBirth;

        if(age>=13 && age<=19){
            System.out.println("Teenage");
        }
    }

}
