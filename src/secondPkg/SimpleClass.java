package secondPkg;

public class SimpleClass 
{


	int a = 20;  //global variable
	//a=30;
	
	int b = 30;
	
	public void printValofC()
	{
		
		final int a = 50;  //local variable
		//a=100;
		
		int c = a+b;
		System.out.println(c);
		
		System.out.println(a); //50
	}
	
	public void printvalueA()
	{
		System.out.println(a);  //20
	}
	
	
	
	
}
