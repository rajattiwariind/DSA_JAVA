public class CalculatorTestDrive {
    public static void main(String [] args){
        Calculator calculator = new Calculator();
       int length = calculator.add(1 , 2);
       double breadth = calculator.add(1.5 , 1.77);
       calculator.area(length , breadth);
    }
}
