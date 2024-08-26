public class LeftRotateArray 
{
    public static void LeftRotateByOne(int[] arr)
    {
        if(arr.length==0)
        return;
        int first = arr[0];
        //shift all elements to the left by one position
        for(int i=0;i<arr.length;i++)
        {
            arr[i-1]=arr[i];
        }
        //place the first element at the end of the array
        arr[arr.length-1]=first;

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        LeftRotateByOne(arr);
        System.out.println("After left rotation by one:");
        for(int num:arr){
            System.out.println(num+"");
        }
    }
    
}
