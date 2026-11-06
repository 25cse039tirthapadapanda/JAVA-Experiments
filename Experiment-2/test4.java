class test4 {
    public static void main(String[] args) {
        int[] arr = {12, 34, 12, 45, 67, 89, 34, 90};

        System.out.print("Original array: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }

        System.out.print("\nArray after removing duplicates: ");
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}

