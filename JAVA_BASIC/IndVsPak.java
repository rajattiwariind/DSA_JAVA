import java.util.Scanner;

public class IndVsPak {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter India scores");
        int indiaScore = scanner.nextInt();
        System.out.println("Enter Pakistan scores");
        int pakistanScore =scanner.nextInt();

        if(indiaScore>pakistanScore){
            System.out.println("India win");
        }
        else if(pakistanScore>indiaScore){
            System.out.println("pakistan win");
        }
        else if(indiaScore==pakistanScore){
            System.out.println("Match Tied");
        }

    }
}
