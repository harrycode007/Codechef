import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   Scanner scan = new Scanner(System.in);
	   int t = scan.nextInt();
	   for(int i=0;i<t;i++)
	   {
	       int a = scan.nextInt();
	       int b = scan.nextInt();
	       
	       if(a > b)
	       System.out.println(">");
	       else if(a < b)
	       System.out.println("<");
	       else
	       System.out.println("=");
	   }
	}
}
