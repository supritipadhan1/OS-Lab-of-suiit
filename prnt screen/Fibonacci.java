// Fibonacci of a number
import java.io.*;
class Fibonacci
{
	
	public static void main(String args[]) throws IOException
	{
	  System.out.println("enter value of n");	
		
		BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
		int n=Integer.parseInt(br.readLine());
		int f=0,s=1,t=1;
		System.out.println("Fibonacci Series is=");
		System.out.print(f);
		System.out.print(s);
		System.out.print(t);
		while(t<=n)
		{
			f=s;
			s=t;
			t=f+s;
			System.out.print(t);
		}
	}
}
		
		
		
		
	

