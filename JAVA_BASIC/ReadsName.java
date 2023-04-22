import java.util.Scanner;

public class readsname {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter my name and age ");
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        System.out.println("the name is" +name);
        System.out.println("the age is" +age);

    }
}
