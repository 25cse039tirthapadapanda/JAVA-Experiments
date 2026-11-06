class test5 {
    static String removeFirstAndLast(String str) {
        if (str == null || str.length() <= 2) {
            return "";
        }
        return str.substring(1, str.length() - 1);
    }

    public static void main(String[] args) {
        String str = (args.length > 0) ? args[0] : "Sumerate";
        System.out.println("Original String: " + str);
        System.out.println("After removing first and last characters: " + removeFirstAndLast(str));
    }
}

