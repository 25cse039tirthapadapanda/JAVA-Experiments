class test6 {
    static String repeatLastN(String str, int n) {
        if (n <= 0 || n > str.length()) {
            return "";
        }
        String suffix = str.substring(str.length() - n);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(suffix);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = (args.length > 0) ? args[0] : "Wipro";
        int n = (args.length > 1) ? Integer.parseInt(args[1]) : 3;

        System.out.println("Original String: " + str);
        System.out.println("n: " + n);
        System.out.println("Result: " + repeatLastN(str, n));
    }
}

