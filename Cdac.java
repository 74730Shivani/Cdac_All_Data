import java.util.Scanner;

public class Cdac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading the first line of input (N and K)
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        // Reading the array A
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        // Example logic: Let's consider pairs (A[i], A[j]) where i < j
        int numberOfPairs = 0;
        int sumOfProducts = 0;

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                // Example condition: sum of A[i] and A[j] is greater than K
                if (A[i] + A[j] > K) {
                    numberOfPairs++;
                    sumOfProducts += A[i] * A[j];
                }
            }
        }

        // Output format: two space-separated integers
        System.out.println(numberOfPairs + " " + sumOfProducts);
    }
}
