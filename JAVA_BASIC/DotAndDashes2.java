import java.util.Scanner;

public class DotAndDashes2 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=scanner.nextInt();
        for(int i=1; i<=num; i++){
            String  res="";
                if(i%2==0){
                    for (int j=1; j<=num; j++){
                        res += "*";
                    }
                    System.out.println(res);
                }else {
                    System.out.println("_");
                }
        }
    }
}
