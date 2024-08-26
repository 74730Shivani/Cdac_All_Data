public class Second_largest_Element {
    public static void main(String[] args) {
        int arr[] = {1,2,4,5};
        if(arr.length<2)
        {
            System.out.println("Array must containe at least two elements");
            return;
        }
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int second_smallest= Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {

                second_largest=largest;
                largest = arr[i];
              
            }else if(arr[i]>second_largest && arr[i]!=largest)
            {
                second_largest=arr[i];
            }
            //find the smallest and second smallest elemets
            if(arr[i]<smallest)
            {
                second_smallest = smallest;
               smallest =arr[i];
            }else if(arr[i]<second_smallest && arr[i]!=smallest)
            {
                second_smallest = arr[i];
            }
           
        }
        if(second_largest == Integer.MIN_VALUE)
        {
            System.out.println("No second largest element found");

        }else{
            System.out.println("Second largest element in the array:"+second_largest);

        }
        if(second_smallest == Integer.MAX_VALUE)
        {
            System.out.println("No second smallest element found");
        }else{
        
        System.out.println("Second smallest elemenet in the arry:"+second_smallest);
        
    }
    


}


    
}
