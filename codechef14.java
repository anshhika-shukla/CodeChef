import java.util.*;
class codechef14    //Problem-Sale Season
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0)
        {
            int X=sc.nextInt();
            int cost=0;
            if(X<=100)
            {
                cost=X;
            }
            else if(X>100 && X<=1000)
            {
                cost=X-25;
            }
            else if(X>1000 && X<=5000)
            {
                cost=X-100;
            }
            else 
            {
                cost=X-500;
            }
            System.out.println(cost);
        }
    }
}
