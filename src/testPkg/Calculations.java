package testPkg;

public class Calculations 
{

	
	public void sum()  //method without parameter/argument
	{

		int a = 20;
		int b = 30;
		int c = a+b;
		System.out.println(c);
		
		System.out.println();
		
		
		//return c;
	}
	
	public int add(int a, int b) //method with parameters/arguments
	{
		int c = a+b;  
		
		System.out.println(c);
		return c;
		
		//10+20+30
		//x = 10+20
			//	x+30
		
	}
	
	public static void main(String[] args)
	{
	
		Calculations cal = new Calculations();
		cal.sum();  //50
		cal.add(50, 60); //110
		int x = cal.add(10, 20); //30
		cal.add(x, 30);
		
	}
}
