public class MissingArray {
    public static void missingNumber(int arr[])
    {
        int size=arr.length;
        int sum1=0;
        for(int i=0;i<arr.length;i++)
        {
            sum1=sum1+arr[i];

        }
        System.out.println("Sum1 is equal:"+sum1);
        int sum2=0;
        for(int j=1;j<=size;j++)
        {
            sum2=sum2+j;
        }
        System.out.println("sum2 is equal:"+sum2);
        int missingNumber=sum2-sum1;
        System.out.println("Missing number:"+missingNumber);
   
}
}
