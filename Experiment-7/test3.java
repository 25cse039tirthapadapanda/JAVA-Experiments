import mathoperations.MathOps;

public class test3 {
    public static void main(String[] args) {
        int x = 20;
        int y = 5;

        System.out.println("User-Defined Package 'mathoperations' Demonstration:");
        System.out.println("Operands: x = " + x + ", y = " + y);
        System.out.println("Addition:       " + x + " + " + y + " = " + MathOps.add(x, y));
        System.out.println("Subtraction:    " + x + " - " + y + " = " + MathOps.subtract(x, y));
        System.out.println("Multiplication: " + x + " * " + y + " = " + MathOps.multiply(x, y));
        System.out.println("Division:       " + x + " / " + y + " = " + MathOps.divide(x, y));
    }
}

