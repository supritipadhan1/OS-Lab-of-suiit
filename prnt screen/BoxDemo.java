import java.io.*;
class Box
{
	double width;
	double height;
	double depth;

    Box()
    {
		width=10;
		height=10;
		depth=10;
	} 
			double volume()
			{
			return width*height*depth;
		 }}
				class BoxDemo
			{	
		     public static void main(String args[]) throws IOException        
		     {
		     Box box1=new Box();
		     Box box2=new Box();
		     double volume;
		     volume=box1.volume();
		     System.out.println("vol of my box1 is" +volume);
		     volume=box2.volume();
		     System.out.println("vol of my box2 is" +volume);
}}
