import java.util.*;
class codechef11    //Problem-Carrot Collection
{
    public static void main(String anshika[]) 
    {
        Scanner s=new Scanner(System.in);    
        int t=s.nextInt();
        while(t-->0) 
        {
            int n=s.nextInt();
            int l=s.nextInt();
            int r=s.nextInt();
            int arr[]=new int[(n+1)]; 
            for(int i=1;i<=n;i++) 
            {
                arr[i]=s.nextInt();
            }
            int x=0;
            for(int i=1;i<l;i++) 
            {
                x=x+arr[i];
            }
            int y=0;
            for(int i=r+1;i<=n;i++) 
            {
                y=y+arr[i];
            }
            System.out.println(Math.max(x,y));
        }
    }
}
