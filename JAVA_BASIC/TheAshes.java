import java.util.Scanner;

public class TheAshes {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Score");
        int Australia=scanner.nextInt();
        int England=scanner.nextInt();
        if(Australia>England){
            System.out.println("Australia");
        }else if(Australia<England){
            System.out.println("England");
        }else if(Australia==England){
            System.out.println("Tie");
        }
    }
}
