class test2 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int key = (args.length > 0) ? Integer.parseInt(args[0]) : 30;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println(key + " is present in the array at index " + index);
        } else {
            System.out.println(key + " is not present in the array");
        }
    }
}

