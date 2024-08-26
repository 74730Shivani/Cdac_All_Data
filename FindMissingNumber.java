public class FindMissingNumber {
        public static void main(String[] args) {
            // Example array of 10000 numbers
            int[] arr = {-3000,4000,5000,7000 };
            
            // Step 1: Calculate the expected sum
            int n = 10001;
            int firstTerm = -3000;
            int lastTerm = 7000;
            long expectedSum = (n * (firstTerm + lastTerm)) / 2;
    
            // Step 2: Calculate the actual sum of the array
            long actualSum = 0;
            for (int num : arr) {
                actualSum += num;
            }
    
            // Step 3: Find the missing number
            long missingNumber = expectedSum - actualSum;
    
            System.out.println("The missing number is: " + missingNumber);
        }
    }
    

