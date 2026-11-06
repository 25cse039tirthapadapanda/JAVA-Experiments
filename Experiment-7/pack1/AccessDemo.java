package pack1;

public class AccessDemo {
    private int privateVar = 10;
    int defaultVar = 20;
    protected int protectedVar = 30;
    public int publicVar = 40;

    public void showWithinClass() {
        System.out.println("--- Within the Same Class (AccessDemo) ---");
        System.out.println("privateVar:   " + privateVar + " (Accessible)");
        System.out.println("defaultVar:   " + defaultVar + " (Accessible)");
        System.out.println("protectedVar: " + protectedVar + " (Accessible)");
        System.out.println("publicVar:    " + publicVar + " (Accessible)");
    }
}

