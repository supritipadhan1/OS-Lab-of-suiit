// Prime numbers between 1 to 1000
import java.io.*;
class Prime
{
public static void main(String args[]) throws IOException
{
  int i,p,j;
  System.out.println( "prime numbers between 1 to 1000 are");
   BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
   for(i=2;i<1000;i++)
{
	p=0;
	for(j=2;j<i;j++)
	{
		if(i%j==0)
		{
			p=1;
			break;
		}
	}
	if(p==0)
	{
		System.out.println(i);
	}
}
}
}			



   
