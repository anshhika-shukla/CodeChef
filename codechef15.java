import java.util.*;
class codechef15   //problem-Teleport Home
{
    public static void main(String anshika[])
    {
        Scanner s=new Scanner(System.in);
        int d=s.nextInt();
        int t=s.nextInt();
        int ans=-1;
        if(d<t)
        {
            ans=0;
        }
        else
        {
            ans=d-t;
        }
        System.out.println(ans);
    }
}
