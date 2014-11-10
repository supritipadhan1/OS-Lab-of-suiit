import java.io.*;
class Box
{
	
	 
    double width,height,depth;}
    
    Box()
    {
		width=10;
		height=10;
		depth=10;
	} 
			double volume()
			{
			return width*heigth*depth;
		 }
				class BoxDemo
			{	
		     public static void main(String args[]) throws IOException
		     {
		     Box box1=new Box();
		     Box box2=new Box();
		     double vol;
		     vol=box1.volume();
		     System.out.print("vol of my box1 is" +vol);
		     vol=box2.volume();
		     System.out.print("vol of my box2 is" +vol);
}}
