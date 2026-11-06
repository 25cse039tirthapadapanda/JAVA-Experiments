class test5 {
    public static void main(String[] args) {
        System.out.println("--- Case 1: Exception does not occur ---");
        try {
            int result = 50 / 5;
            System.out.println("Division successful! Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Catch block: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed in Case 1");
        }

        System.out.println("\n--- Case 2: Exception occurs and is handled ---");
        try {
            int result = 50 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Catch block: Cannot divide by zero! (" + e.getMessage() + ")");
        } finally {
            System.out.println("Finally block executed in Case 2");
        }
    }
}

