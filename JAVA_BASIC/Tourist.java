import java.util.ArrayList;
import java.util.Scanner;


public class Tourist {
    public static void main(String [] args){
        ArrayList<String> List = new ArrayList<>();

        System.out.println("Enter the size");
        Scanner scanner=new Scanner(System.in);

        int n = scanner.nextInt();
        System.out.println("Enter tourist names");
        for (int i=0; i<n; i++){
            List.add(scanner.next());
        }
        for (int i=0; i<List.size(); i++){
            if (List.get(i).length()>5){
                System.out.println(List.get(i));
            }
        }
    }
}
