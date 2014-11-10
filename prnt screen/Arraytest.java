// My Name Is
import java.io.*;
class Arraytest
{
	public static void main(String args[]) throws IOException
	 {
	
	 int i;
	 int x[]={10,20,30,40,50,60};
	 System.out.println("Enter The Number You Are Searching");
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 int n=Integer.parseInt(br.readLine());
	 for (i=0;i<6;i++)
	 { 
		 if(x[i]==n)
		 {
			System.out.println(i);
		}
	}
}
} 
	
