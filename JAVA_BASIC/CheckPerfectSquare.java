import java.util.Scanner;  
public class CheckPerfectSquareExample1  {   
static boolean checkPerfectSquare(double number){   
double sqrt=Math.sqrt(number);   
return ((sqrt - Math.floor(sqrt)) == 0);   
}   
//main method  
public static void main(String[] args)    
{   
System.out.print("Enter any number: ");  
Scanner sc=new Scanner(System.in);  
double number=sc.nextDouble();   
if (checkPerfectSquare(number))   
System.out.print("Yes, the given number is perfect square.");   
else  
System.out.print("No, the given number is not perfect square.");   
}   
}  
