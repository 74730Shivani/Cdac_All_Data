public class ReversedString {
    public static void main(String args[])
    {
        String str = "Shivani",nstr="";
        char ch ;
        System.out.println("original string");
        System.out.println("Shivani");
        for(int i=0;i<str.length();i++)
        {
            ch = str.charAt(i);
            nstr=ch+nstr;

        }
        System.out.println("Reverse the word:"+nstr);
    }
    
}
