import java.io.*;
class Leap
{
	public static void main(String args[]) throws IOException
	 {
	
	 int x;
	 
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 
	 System.out.println("enter the year");
	 x=Integer.parseInt(br.readLine());
	if((x%4==0&&x%100!=0)||(x%400==0))
	{
	 System.out.println("this is a leap year " +x);
	}
	else
	{
		System.out.println("this is not a leap year " +x);
	 }
	 }
 }
	 
	 
