import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int n = 2;  // Number of positions to rotate

        // Step 1: Perform left rotation
        int[] rotatedArray = leftRotate(arr, n);

        // Step 2: Reverse the array
        reverse(rotatedArray);

        // Print the result
        System.out.println(Arrays.toString(rotatedArray));
    }

    // Function to left rotate the array by n positions
    public static int[] leftRotate(int[] arr, int n) {
        int length = arr.length;
        int[] rotated = new int[length];

        for (int i = 0; i < length; i++) {
            rotated[i] = arr[(i + n) % length];
        }

        return rotated;
    }

    // Function to reverse the array
    public static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
