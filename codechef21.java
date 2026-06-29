import java.util.*;
class codechef21  //problem Least Common Anagram
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int min[]=new int[26];
        Arrays.fill(min,Integer.MAX_VALUE);
        for(int i=0;i<n;i++) 
        {
            String str=sc.next();
            int curr[]=new int[26];    
            for(char ch:str.toCharArray()) 
            {
                curr[ch-'a']++;
            }
            for(int j=0;j<26;j++) 
            {
                if(curr[j]<min[j]) 
                {
                    min[j]=curr[j];
                }
            }
        }
        String k="";
        for(int i=0;i<26;i++) 
        {
            while(min[i]>0 && min[i]!=Integer.MAX_VALUE) 
            {
                k=k+(char)('a'+i);
                min[i]--;
            }
        }
        if(k.isEmpty())
        {
            System.out.println("no such string");
        }
        else
        {
            System.out.println(k);
        }
    }
}