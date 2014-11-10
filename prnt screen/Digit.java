import java.io.*;
class Digit
{
	public static void main(String args[]) throws IOException
	 {
	
	 int a, b ,c,e,f;
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 System.out.println("enter the value of a 3 digit number");
	 a=Integer.parseInt(br.readLine());
     c=a%10;
     System.out.println("the third place is "+c);
	 b=a/10;
     e=b%10;
     System.out.println("the second place is "+e);
     f=b/10;
     System.out.println("the first place is "+f);
 }}
 
 
