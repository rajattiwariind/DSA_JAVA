import java.util.Scanner;

public class WorldCupFinal {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the score");
        int Nzscore=scanner.nextInt();
        int Nzsuperover=scanner.nextInt();
        int Nzfour=scanner.nextInt();
        int Engscore=scanner.nextInt();
        int Engsuperover=scanner.nextInt();
        int Engfour=scanner.nextInt();
        if(Nzscore>Engscore){
            System.out.println("New Zealand");
        }else if(Nzscore<Engscore){
            System.out.println("England");
        }else if(Nzsuperover>Engsuperover){
            System.out.println("New Zealand");
        }else if(Nzsuperover<Engsuperover){
            System.out.println("England");
        }else if(Nzfour>Engfour){
            System.out.println("New Zealand");
        }else if(Nzfour<Engfour){
            System.out.println("England");
        }

    }
}
