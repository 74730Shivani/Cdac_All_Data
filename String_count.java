public class String_count {
    public static void main(String args[])
    {
        String string = "aabbccaabb";
        int count=0;
        for(int i=0;i<string.length();i++)
        {
            if(string.charAt(i) != ' ')    
            count++;    
        }
        System.out.println("total number of char :"+count);
    }
}
