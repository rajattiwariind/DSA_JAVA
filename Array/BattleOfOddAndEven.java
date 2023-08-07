import java.util.*;
public class WarOddAndEven {

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int size=0;
        size=Integer.parseInt(sc.nextLine().trim());
        if(size>1){
            String output="";
            String arrayElements=sc.nextLine();
            String [] array=arrayElements.split(" ");
            int even=0,odd=0;
            for(int i=0;i<array.length;i++){
                if(Integer.parseInt(array[i])%2==0){
                    even+=Integer.parseInt(array[i]);
                }else{
                    odd+=Integer.parseInt(array[i]);
                }
            }
            if(even>odd){
                output="Even";
            }else if(odd>even){
                output="Odd";
            }else if(even==odd){
                output="Tied";
            }
            System.out.println(output);
        }

        sc.close();
    }
}
