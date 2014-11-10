interface Myinterface
{
	String hello="Hello";
	public void sayHello();
}
class Myinterface1 implements Myinterface
{
	public void sayHello()
	{
		System.out.println("Myinterface " +hello);
	}
	public static void main(String args[])
	{
		Myinterface1 a= new Myinterface1();
		a.sayHello();
	}
}
