import java.util.Scanner;

public class codechef24   //Problem Chef and Candies
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            
            
            if (x >= n) {
                System.out.println(0);
            } else {
                int needed = n - x;
               
                int packets = (needed + 3) / 4;
                System.out.println(packets);
            }
        }
    }
}
