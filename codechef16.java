import java.util.*;
public class codechef16
{
    public static void main(String args[])                         // Problem Minimum Pizzas
    {
        Scanner sc=new Scanner(System.in);    
        int t=sc.nextInt();      
        while(t-->0) 
        {
            int n=sc.nextInt();
            int x=sc.nextInt();    
            int totalSlices=n*x;
            int pizzas=(totalSlices+3)/4;
            System.out.println(pizzas);
        }
    }
}
