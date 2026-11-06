import java.util.Arrays;

class test3 {
    public static void main(String[] args) {
        int[] arr = {45, 12, 85, 32, 89, 39, 69, 44, 42, 1, 6, 8};
        Arrays.sort(arr);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
        System.out.println("Smallest two numbers: " + arr[0] + ", " + arr[1]);
        System.out.println("Largest two numbers: " + arr[arr.length - 2] + ", " + arr[arr.length - 1]);
    }
}

