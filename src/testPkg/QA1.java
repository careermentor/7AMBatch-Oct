package testPkg;

public class QA1 
{

	int i = 500;
	
	public  void sum(int a, int b)
	{
		int c = a+b;
		System.out.println("sum of two integer a&b: " + c);
		
	}
	
	public void sum(int a, float b)
	{
		float c = a+b;
		
		System.out.println("sum of one integer and one float a&b: " + c);
		
	}
	
	public void sum(int a, int b, int c)
	{
		int d = a+b+c;
		System.out.println("sum of 3 integres a&b&c: " + d);
		
	}
	
	public static void main(String[] args) {
		QA1 q1 = new QA1();
		q1.sum(30, 40);
		q1.sum(10, 20.5f);
		q1.sum(10, 20, 30);
	}
}
