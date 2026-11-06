import pack1.AccessDemo;
import pack1.SamePackageDemo;

class SubClassOutsidePackage extends AccessDemo {
    public void showInSubClass() {
        System.out.println("\n--- Outside Package (Subclass via inheritance) ---");
        System.out.println("privateVar:   Not Accessible");
        System.out.println("defaultVar:   Not Accessible");
        System.out.println("protectedVar: " + protectedVar + " (Accessible via inheritance)");
        System.out.println("publicVar:    " + publicVar + " (Accessible)");
    }
}

public class test2 {
    public static void main(String[] args) {
        AccessDemo demo = new AccessDemo();
        demo.showWithinClass();

        SamePackageDemo samePack = new SamePackageDemo();
        samePack.showWithinSamePackage();

        SubClassOutsidePackage subObj = new SubClassOutsidePackage();
        subObj.showInSubClass();

        System.out.println("\n--- Outside Package (Non-subclass) ---");
        System.out.println("privateVar:   Not Accessible");
        System.out.println("defaultVar:   Not Accessible");
        System.out.println("protectedVar: Not Accessible");
        System.out.println("publicVar:    " + demo.publicVar + " (Accessible)");
    }
}

