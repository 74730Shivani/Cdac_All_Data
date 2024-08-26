 
    public class MaxAreaOfObject {

        public static int findMaxArea(int[] array) {
            int maxArea = 0;  // To store the maximum area found
            int currentArea = 0;  // To store the area of the current object (continuous sequence of 1s)
    
            for (int num : array) {
                if (num == 1) {
                    // Increment the area if the current element is 1
                    currentArea++;
                } else {
                    // If the current element is 0, compare the current area with maxArea and reset currentArea
                    maxArea = Math.max(maxArea, currentArea);
                    currentArea = 0;
                }
            }
    
            // Final comparison to handle the case where the array ends with a sequence of 1s
            maxArea = Math.max(maxArea, currentArea);
    
            return maxArea;
        }
    
        public static void main(String[] args) {
            int[] array = {1, 1, 0, 1, 1, 1, 0, 1, 1}; // Example array
            int maxArea = findMaxArea(array);
            System.out.println("The maximum area of the object is: " + maxArea);
        }
    }
    

