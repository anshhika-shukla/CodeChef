import java.util.*;
class codechef18    //problem Expert Setter
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) 
        {
            int x=sc.nextInt(); 
            int y=sc.nextInt(); 
            if(2*y >= x) 
            {
                System.out.println("YES");
            } 
            else 
            {
                System.out.println("NO");
            }
        }
    }
}