package testPkg;

public class LearnStaticKwd 
{

	static int i = 20;
	
	public static void printVal()
	{
		
		System.out.println(i);
	}
	
	public void printText()
	{
		System.out.println("this is non static method");
	}
	
	public static void main(String[] args) 
	{
		LearnStaticKwd ls = new LearnStaticKwd();
		LearnStaticKwd.printVal();
		ls.printText();
	}
	
}
