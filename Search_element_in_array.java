import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
		int x=sc.nextInt();//size , element
		int[] a=new int[n];
		
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
        		
        		int f=0;
        for(int i=0;i<n;i++){
		   if(a[i]==x)
		    {
		        System.out.println("YES");
		        f=1;
		        break;
            }
            
        }
        
        if(f==0)
	        System.out.println("NO");

        
	}
}
