class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class MethodOverloadingDemo {
    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println("Addition of 2 integers = " + c.add(10, 20));
        System.out.println("Addition of 2 doubles = " + c.add(10.5, 20.5));
        System.out.println("Addition of 3 integers = " + c.add(10, 20, 30));
    }
}