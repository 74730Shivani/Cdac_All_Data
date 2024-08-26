import java.util.Scanner;
public class ProductivePairs {
    public static void main(String args[])
    {
        int N=5;
        int K=10;
        int[] arr ={1,2,3,5,11};
        int count=0;
        long sum=0;
        for(int i=0;i<N;i++)
        {
            for(int j=i+1;j<N;j++)
            {
                int productivity=arr[i]*arr[j];
                if(productivity>=K)
                {
                    count++;
                    sum+=productivity;
                }
            }
        }
        System.out.println("Number of productive pairs:"+count);
        System.out.println("Sum of productive pairs:"+sum);
    }
}
