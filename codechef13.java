import java.util.*;
class codechef13     //Problem-Elections in Chefland
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int Xa=sc.nextInt();
            int Xb=sc.nextInt();
            int Xc=sc.nextInt();
            if(Xa>50)
            {
                System.out.println("A");
            }
            else if(Xb>50)
            {
                System.out.println("B");
            }
            else if(Xc>50)
            {
                System.out.println("C");
            }
            else
            {
                System.out.println("NOTA");
            }
        }
    }
}
