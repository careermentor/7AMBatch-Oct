package testPkg;

public class LearnConst 
{

	
	
	public int sum()
	{
		int a = 20;
		int b = 30;
		int c = a+b;
		System.out.println("sum of a&b: " + c);
		return c;
	}
	
	public int add(int a, int b)
	{
		int c = a+b;
		System.out.println("addition of a&b: " + c);
		return c;
		
		
	}
	
	public static void main(String[] args) {
		
		LearnConst abc = new LearnConst(100,200);  //constructor will be automatically called
		abc.sum();
		int x = abc.add(30, 40);
		abc.add(x, 50);
		
		
	}
	
	
	public LearnConst(int a, int b)
	{
		int c = a+b;
		System.out.println(c);
		System.out.println("this is a constructor");
		
	}
	
	
	
	
	
	
	
}

