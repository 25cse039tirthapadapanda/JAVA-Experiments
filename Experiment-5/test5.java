interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

class MultiFunctionDevice implements Printer, Scanner {
    @Override
    public void print() {
        System.out.println("Printing document in high resolution...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning document to PDF format...");
    }
}

class test5 {
    public static void main(String[] args) {
        MultiFunctionDevice device = new MultiFunctionDevice();
        device.print();
        device.scan();
    }
}

