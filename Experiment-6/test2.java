class test2 {
    static String concatLowerCase(String s1, String s2) {
        return (s1 + s2).toLowerCase();
    }

    public static void main(String[] args) {
        String s1 = (args.length > 0) ? args[0] : "Hello";
        String s2 = (args.length > 1) ? args[1] : "WORLD";

        System.out.println("String 1: " + s1);
        System.out.println("String 2: " + s2);
        System.out.println("Concatenated in lowercase: " + concatLowerCase(s1, s2));
    }
}

