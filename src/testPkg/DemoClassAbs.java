package testPkg;

public abstract class DemoClassAbs   //concrete class
{
	

	public void meth1()    //concrete method
	{

		int a = 30;
		a=50;
		
		System.out.println("this is a concrete method");
		System.out.println(a);
	}
	

	public abstract void meth2();
	public abstract void meth4();
	public abstract void meth5();
	
	
	public static void main(String[] args)
	{
		//DemoClassAbs dc = new DemoClassAbs();
		
		
	}
	
}
