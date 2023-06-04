public class CalculatorTestDrive {
    public static void main(String [] args){
        Calculator calculator = new Calculator();
        int sum = calculator.add(1 , 2);
        System.out.println(sum);
        int sum1 = calculator.add(1 , 2);
        System.out.println(sum1);
    }
}
