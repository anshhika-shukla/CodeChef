import java.util.*;
public class codechef22  //Problem Leader of an Array
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long a[]=new long[n];
        for(int i=0;i<n;i++) 
        {
            a[i]=sc.nextLong();
        }
        long c[]=new long[n];
        int count=0;
        long max=Long.MIN_VALUE;
        for(int i=n-1;i>=0;i--) 
        {
            if(a[i]>max) 
            {
                c[count++]=a[i];
                max=a[i];
            }
        }
        for(int i=count-1;i>=0;i--) 
        {
            System.out.print(c[i]+" ");
        }
    }
}
