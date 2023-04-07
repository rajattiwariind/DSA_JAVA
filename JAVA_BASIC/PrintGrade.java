import java.util.Scanner;

public class PrintGrade {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int marks=scanner.nextInt();
        if(marks==100){
            System.out.println("A");
        }else if(marks>=90){
            System.out.println("B");
        }else if(marks>=80){
            System.out.println("C");
        }else{
            System.out.println("F");
        }
    }
}
