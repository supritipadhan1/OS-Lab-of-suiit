//Menu Driven program
import java.io.*;
class Menu
{
public static void main(String Args[]) throws IOException
{
int a=4, b=2;
System.out.println("1.Addition");
System.out.println("2.Subtraction");
System.out.println("3.Multiplication");
System.out.println("4.Division");
System.out.println("Enter your choice");
BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
int ch=Integer.parseInt(br.readLine());
if(ch==1)
{  
   
   
   System.out.print("Sum is c=" +(a+b));
		
}

if(ch==2)
{ 
	
	System.out.print("Sub is s=" +(a-b));
	
}	

if(ch==3)
{
	int m;
	m=a*b;
	System.out.print("mul is m=" +m);
}

if (ch==4)
{
    
    int d;
    d=a/b;
    System.out.print("div is d=" +d);
}
}}








