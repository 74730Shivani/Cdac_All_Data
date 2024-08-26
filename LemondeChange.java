public class LemondeChange
 {
    public boolean lemondeChange(int[] bills)
    {
        int five_d=0 ,ten_d=0;
        for (int bill : bills) {
            if(bill==5)
            {
                five_d++;
            }else if(bill==10)
            {
                if(five_d==0)
                {
                    return false;
                }
                five_d--;
                ten_d++;

            }else if(bill==20)
            {
                if(ten_d>0&& five_d>0){
                    ten_d--;
                    five_d--;
                }
                else if(five_d>=3)
                {
                    five_d=five_d-3;
                }else
                {
                    return false;
                }
            }
        }
        return true;

    }

    public static void main(String[] args) 
    {
        LemondeChange solution = new LemondeChange();
        int[] bills1 = {5,5,5,10,20};
        System.out.println(solution.lemondeChange(bills1));
        int[] bills2 = {5,5,10,10,20};
        System.out.println(solution.lemondeChange(bills2));
        
    }
}
