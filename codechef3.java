
Home  » Reversing directions » All Submissions » harry_8652 [18971226]
Solution: 18971226

CodeChef submission 18971226 (JAVA) plaintext list. Status: AC, problem DIRECTI, contest CODECHEF. By harry_8652 (harry_8652), 2018-06-23 21:27:19.

    import java.util.*;
    import java.lang.*;
    import java.io.*;
     
    class Codechef
    {
    	public static void main (String[] args) throws java.lang.Exception
    	{
    		Scanner scan = new Scanner(System.in);
    		int t = scan.nextInt();
    		for(int i=0;i<t;i++)
    		{
    		    int n = scan.nextInt();
    		    scan.nextLine();
    		    
    		    
    		   ArrayList<String> a = new ArrayList<>();
                for(int j=0; j<n ;j++) 
                {
                    a.add(scan.nextLine());
                }
                
                System.out.println("Begin"+a.get(n-1).substring(a.get(n-1).indexOf(" ")));
                for(int j=n-1; j>0; j--) 
                {
                    if(a.get(j).startsWith("Left"))
                    {
                        System.out.println("Right"+a.get(j-1).substring(a.get(j-1).indexOf(" ")));
                    }
                    else 
                    {
                        System.out.println("Left"+a.get(j-1).substring(a.get(j-1).indexOf(" ")));
                    }
                }
                System.out.println();
            }
    		
    		
    	}
    }
     

