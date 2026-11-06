package pack1;

public class SamePackageDemo {
    public void showWithinSamePackage() {
        AccessDemo obj = new AccessDemo();
        System.out.println("\n--- Within the Same Package (SamePackageDemo) ---");
        System.out.println("privateVar:   Not Accessible (Compile-time error)");
        System.out.println("defaultVar:   " + obj.defaultVar + " (Accessible)");
        System.out.println("protectedVar: " + obj.protectedVar + " (Accessible)");
        System.out.println("publicVar:    " + obj.publicVar + " (Accessible)");
    }
}

