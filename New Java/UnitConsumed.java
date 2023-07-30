import java.util.Scanner;

public class UnitConsumed {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int cost = scanner.nextInt();
        if (cost<=230){
            System.out.println((cost-80)/3);
        }else if (cost<=650){
            System.out.println(50+(cost-230)/5);
        }else {
            System.out.println(150 + (cost - 730)/10);
        }
    }

}
/*
Total 930 rupees is the bill amount
total consumed will be 170 units

1. Fix Charge = 80
2. Charge for 1st 50 units = 50*3=150
3. Charge for 1st 100 units = 100*5=500
4. Charge for 1st 20 units = 20*10= 200

Total Charges equal to :
80+150+500+20=930
 */
