class test4 {
    public static void main(String[] args) {
        // Scenario 1: ArithmeticException handled by multiple catch blocks
        try {
            System.out.println("Scenario 1: Division by zero");
            int a = 10, b = 0;
            int c = a / b;
            System.out.println("Result: " + c);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        }

        // Scenario 2: ArrayIndexOutOfBoundsException handled by multiple catch blocks
        try {
            System.out.println("\nScenario 2: Array index out of bounds");
            int[] arr = new int[3];
            arr[5] = 50;
            System.out.println("Value: " + arr[5]);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        }

        // Scenario 3: NumberFormatException handled by multiple catch blocks
        try {
            System.out.println("\nScenario 3: Invalid number format");
            int num = Integer.parseInt("abc");
            System.out.println("Parsed number: " + num);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        }
    }
}
