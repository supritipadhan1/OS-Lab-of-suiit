interface calculate
{
	int var=0;
	void call(int item);
	
}
class display implements calculate
{
	int x;
	public void call(int item)
	{
		if(item<2)
		x=var;
		else
		x=item*item;
	}
}
class interface11
{
	public static void main(String args[])
	{
		display[]arr=new display[3];
		for(int i=0;i<3;i++)
		arr[i]=new display();
		arr[0].call(0);
		arr[1].call(1);
		arr[2].call(2);
		System.out.println(arr[0].x+" "+arr[1].x+" "+arr[2].x);
	}
}
		 
