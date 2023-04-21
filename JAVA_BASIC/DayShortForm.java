import java.util.Scanner;

public class DayShortForm {
    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the day of week");
        String day=scanner.next();

        if(day.equals("Monday")){
            System.out.println("Mon");
        }else if(day.equals("tuesday")){
            System.out.println("tue");
        }
       else if(day.equals("Wednesday")){
            System.out.println("wed");
        }
        else if(day.equals("Thursday")){
            System.out.println("Thur");
        }
        else if(day.equals("Friday")){
            System.out.println("Fri");
        }
        else if(day.equals("Saturday")){
            System.out.println("sat");
        }
        else if(day.equals("Sunday")){
            System.out.println("Sun");
        }
        else{
            System.out.println("invalid");
        }
    }
}
