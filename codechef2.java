import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef2        //Problem Easy Pronunciation
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 Scanner sc = new Scanner(System.in);
         int T=sc.nextInt();
         while(T-->0) 
         {
            int N=sc.nextInt();
            String S=sc.next();
            int cnt=0;
            boolean hard=false;
            for(int i=0;i<N;i++) 
            {
                char ch=S.charAt(i);
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') 
                {
                    cnt=0;
                } 
                else 
                {
                    cnt++;
                    if(cnt>=4) 
                    {
                        hard=true;
                        break;
                    }
                }
            }
            System.out.println(hard ? "NO" : "YES");
        }
	}
}
