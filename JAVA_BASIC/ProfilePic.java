import java.util.Scanner;

public class ProfilePic {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Number");
        int L=scanner.nextInt();
        int W=scanner.nextInt();
        int Length=scanner.nextInt();
        int Width=scanner.nextInt();
        if(Length>L && Width>W){
            System.out.println("Upload");
        }else if(Length<L){
            System.out.println("Increase length");
        }else if(Width<W){
            System.out.println("Increase width");
        }
    }
}
