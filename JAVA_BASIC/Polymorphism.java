public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class CalculatorTestDrive {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(2, 3));
        System.out.println(calculator.add(2, 3, 5));
    }
}
