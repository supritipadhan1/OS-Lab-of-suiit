import java.io.*;
class Square
{
	double square1;
	double square2,l;
    Square()
    {
		square1=3;
		square2=0.2;
	
	
	} 
			double Area()
			{
			return square1*square1;
		 }}
				class SquareDemo
			{	
		     public static void main(String args[]) throws IOException        
		     {
		     Square square1=new Square();
		     Square square2=new Square();
		     double Area;
		     Area=square1.Area();
		     System.out.println(+Area);
		     Area=square2.Area();
		     System.out.println(+Area);
}}
