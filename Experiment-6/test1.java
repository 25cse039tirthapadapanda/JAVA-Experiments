class test1 {
    public static void main(String[] args) {
        String str = (args.length > 0) ? args[0] : "madam";
        String rev = new StringBuilder(str).reverse().toString();

        System.out.println("Input String: " + str);
        if (str.equalsIgnoreCase(rev)) {
            System.out.println(str + " is a Palindrome");
        } else {
            System.out.println(str + " is not a Palindrome");
        }
    }
}

