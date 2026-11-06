interface NumberPrinter {
    void printNumber(Integer Num);
}

class MyPrinter implements NumberPrinter {
    @Override
    public void printNumber(Integer Num) {
        System.out.println("The given number is: " + Num);
    }
}

class test4 {
    public static void main(String[] args) {
        NumberPrinter np = new MyPrinter();
        np.printNumber(100);
    }
}

