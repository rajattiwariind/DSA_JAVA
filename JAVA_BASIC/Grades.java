import java.util.Scanner;

public class Grades {
    public static void main(String[]args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter the grade obtained");
        String grade = scanner.next();
        switch (grade) {
            case "A":
                System.out.println("Excellent");
                break;
            case "B":
                System.out.println("Very Good");
                break;
            case "C":
                System.out.println("good");
                break;
            case "D":
                System.out.println("need a lots of improvement");
                break;
            case "F":
                System.out.println("Failed");
                break;
            default:
                System.out.println("Invalid grade");
        }
    }
}
