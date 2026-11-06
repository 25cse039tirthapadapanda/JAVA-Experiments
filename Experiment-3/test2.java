class Calculator {
    static double power(int num1, int num2) {
        return Math.pow(num1, num2);
    }

    static double power(double num1, double num2) {
        return Math.pow(num1, num2);
    }
}

class test2 {
    public static void main(String[] args) {
        System.out.println("Testing Calculator.power(int, int):");
        System.out.println("2^5 = " + Calculator.power(2, 5));

        System.out.println("\nTesting Calculator.power(double, double):");
        System.out.println("2.5^3.0 = " + Calculator.power(2.5, 3.0));
    }
}

