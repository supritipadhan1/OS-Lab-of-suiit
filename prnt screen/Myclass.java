interface A
{
	void meth1();
	void meth2();
}
class Myclass implements A
{
public void meth1()
{
	System.out.println(" This is the method two ");
}
public void meth2()
{
	
	System.out.println(" This is the method one ");
    
}}

class Myclass1
{
public static void main (String args[] )
{
	Myclass ob =new Myclass();
	ob.meth1();
	ob.meth2();
}
}

	
