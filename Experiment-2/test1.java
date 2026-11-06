class test1 {
    public static void main(String[] args) {
        int[] arr = {25, 11, 7, 75, 56};
        int min = arr[0], max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.print("Array elements: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println("\nMaximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}

