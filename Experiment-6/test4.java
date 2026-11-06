class test4 {
    static String getFirstHalf(String str) {
        if (str == null || str.length() % 2 != 0) {
            return null;
        }
        return str.substring(0, str.length() / 2);
    }

    public static void main(String[] args) {
        String s1 = (args.length > 0) ? args[0] : "TomCat";
        String s2 = (args.length > 1) ? args[1] : "Apron";

        System.out.println("String: " + s1 + " -> First Half: " + getFirstHalf(s1));
        System.out.println("String: " + s2 + " -> First Half: " + getFirstHalf(s2));
    }
}

