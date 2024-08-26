public class RemoveDuplicateElements 
{
    public static void main (String args[])
    {
        int[] nums = {1,1,2,2,3,4,4,5};
        int newLenght = removeDuplicates(nums);
        System.out.println("after removing duplicates:");
        for(int i=0;i<newLenght;i++)
        {
            System.out.println(nums[i]+" ");
            
        }
    
    }

    public static int removeDuplicates(int[] nums)
    {
        if(nums.length==0)
        return 0;
        int uniqueindex =0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=nums[uniqueindex])
            {
                uniqueindex++;
                nums[uniqueindex]=nums[i];
            }
        

        }
        return uniqueindex + 1;
    }
    
}
