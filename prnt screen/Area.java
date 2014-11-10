import java.io.*;
class Area
{
	public static void main(String args[]) throws IOException
	 {
	
	 int l, w;
	 int Area;
	 
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 
	 System.out.println("enter the value of length");
	 l=Integer.parseInt(br.readLine());
	 System.out.println("enter the value of width");
	 w=Integer.parseInt(br.readLine());
	 Area= l*w;
	 System.out.println("the area of the rectangle is " +Area);
	 }}
	 
	 
	 
	 
