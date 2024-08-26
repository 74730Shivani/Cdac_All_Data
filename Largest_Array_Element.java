//largest element in array 
class Largest_Array_Element
{
  public static void main(String[] args) {
     
    int arr[] = {10,40,56,100,87};
    int largest = arr[0];
    for(int i=1;i<arr.length;i++)
    {
        if(arr[i]>largest)
        {
            largest = arr[i];
        }
        
    }
    System.out.println("largest element is :"+largest);
    


  }
}