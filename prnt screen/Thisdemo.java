import java.io.*;

class Thisdemo
{
	int x = 5;
	public static void main(String[]args) throws IOException

{
	Thisdemo obj=new Thisdemo();
	obj.method(20);
	obj.method();
}
}
Void method(int x)
{
	x=10;
	System.out.println("value of instance variable" +this.x);
	System.out.println("value of local variable" +x);
}
void method()
{
	int x=40;
	System.out.println("value of local variable" +x);
	System.out.println("value of instance variable" +this.x);
}
	
	
	
	

