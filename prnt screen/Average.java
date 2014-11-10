import java.io.*;

class Average

{
	public static void main(String args[]) throws IOException
	 {
	 int result=0;
	 int i;
	 int x[]={10,20,30,40,50};
	
	 
	 for (i=0;i<5;i++)
	 result = result + x[i];
	 System.out.println( "Sum is " +result);
     System.out.println( " Avarage is " +result/5);
 }
 
}
	 
