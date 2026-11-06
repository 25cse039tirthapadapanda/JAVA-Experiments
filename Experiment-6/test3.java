class test3 {
    static String copyFirstTwo(String str) {
        int n = str.length();
        String prefix = (n < 2) ? str : str.substring(0, 2);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(prefix);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = (args.length > 0) ? args[0] : "Wipro";
        System.out.println("Original String: " + str);
        System.out.println("Result: " + copyFirstTwo(str));
    }
}

