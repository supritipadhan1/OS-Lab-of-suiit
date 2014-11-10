import java.io.*;
import java.util.Scanner;
class Sumtest

{
	public static void main(String args[]) throws IOException
	 {
	 int i;
	 int num[] = new int[5];
	Scanner in=new Scanner (System.in);
	 System.out.println( "enter the array elements");
	 for(i=0;i<5;i++)
	{
       num[i]= in.nextInt();
  }
     
     for(i=0;i<10;i++)
     {
     System.out.print(num[i]);
     System.out.print("\t");}
 
 
 }
}
 
 

	 
