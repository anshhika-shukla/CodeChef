//   █████╗ ███╗   ██╗ ███████╗ ██╗  ██╗ ██╗ ██╗  ██╗  █████╗
//  ██╔══██╗████╗  ██║ ██╔════╝ ██║  ██║ ██║ ██║ ██╔╝ ██╔══██╗
//  ███████║██╔██╗ ██║ ███████╗ ███████║ ██║ █████╔╝  ███████║
//  ██╔══██║██║╚██╗██║ ╚════██║ ██╔══██║ ██║ ██╔═██╗  ██╔══██║
//  ██║  ██║██║ ╚████║ ███████║ ██║  ██║ ██║ ██║  ██╗ ██║  ██║
//  ╚═╝  ╚═╝╚═╝  ╚═══╝ ╚══════╝ ╚═╝  ╚═╝ ╚═╝ ╚═╝  ╚═╝ ╚═╝  ╚═╝

import java.util.*;
class codechef19   //problem Chef and Two Strings
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);    
        int t=sc.nextInt();
        while(t-->0) 
        {
            String s1=sc.next();
            String s2=sc.next();    
            int min=0;
            int max=0;
            for(int i=0;i<s1.length();i++) 
            {
                char c1=s1.charAt(i);
                char c2=s2.charAt(i);
                if(c1=='?' || c2=='?') 
                {
                    max++; 
                } 
                else if(c1 != c2) 
                {
                    min++;
                    max++;
                }
            }
            System.out.println(min+" "+max);
        }
    }
}