import java.util.Scanner;

public class BruteForce {
    public static void main(String[] args){
      String reverse="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String name= sc.nextLine();
      for(int i=name.length()-1;i>=0;i--) {
          reverse = reverse + name.charAt(i);
      }
          if(name.equals(reverse)){
              System.out.println("The String is palindrome");
          }else{
              System.out.println("Not Palindrome ");
          }
      }
}
