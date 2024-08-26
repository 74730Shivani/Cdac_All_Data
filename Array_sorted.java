public class Array_sorted {

    public static boolean isSorted(int[] arr)
    {
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<arr[i-1])
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) 
    {
        
        int[] arr = {90,20,30,40,};
        if(isSorted(arr))
        {
            System.out.println("the array is sorted");
        }
        else
        {
            System.out.println("the array is not sorted");
        }
         

    }
    
}
