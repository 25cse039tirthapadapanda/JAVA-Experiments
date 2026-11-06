import mypack.PackageDemo;

public class test1 {
    public static void main(String[] args) {
        PackageDemo demo = new PackageDemo();
        demo.displayMessage();
        System.out.println("\nCompilation & Execution steps:");
        System.out.println("1. Compile package class: javac -d . mypack/PackageDemo.java");
        System.out.println("2. Compile main runner:  javac test1.java");
        System.out.println("3. Run application:       java test1");
    }
}

