import java.io.*;
class Sum
{
	public static void main(String args[]) throws IOException
	 {
	
	 int i,sum=0,n,x;
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 System.out.println("enter a digit");
     n=Integer.parseInt(br.readLine());
     while(n>0)
     {
		 x=n%10;
		 sum+=x;
		 n=n/10;
	 }
	 System.out.println("sum of the no " +sum);
 
 }}
