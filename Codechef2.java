import java.util.Scanner;

class Codechef2
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   Scanner scan = new Scanner(System.in);
	   int t = scan.nextInt();
	   for(int i = 0 ; i < t ; i++)
	   {
	       int n = scan.nextInt();
	         
	       int ans = n/2 + 1;
	       System.out.println(ans);
	   }
	}
}
