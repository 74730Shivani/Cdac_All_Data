public class Ascending 
{
    public static void main(String[] args) {
        int [] arr = new int[]{10,30,55,20,1};
        int temp =0;
        System.out.println("Element of original array");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        for(int i=0;i<arr.length;i++)
        {
           for(int j=i+1;j<arr.length;j++)
           {
            if(arr[i]>arr[j])
            {
                temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

            }
           } 
        }System.out.println("Element of array sorted");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
    
}
