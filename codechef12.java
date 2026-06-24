import java.util.*;
class codechef12    //Problem-Passing Chain
{
    public static void main(String anshika[]) 
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0) 
        {
            int n=s.nextInt();
            int k=s.nextInt();
            int ans=1;
            while((ans+k)<=n) 
            {
                ans=ans+k;
            }
            System.out.println(ans);
        }
    }
}
