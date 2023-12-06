package testPkg;

public class QA4 extends QA2// implements QA3I
{

	
	public void div(int a, int b)
	{
		int c = a/b;
		System.out.println("mul of a&b: " + c);
		
	}
	
	public static void main(String[] args) {
		QA4 q4 = new QA4();
		//q4.sub(20, 30);
		//q4.sum(30, 40);
		//q3.mul(20, 30);
		q4.div(40, 20);
		
		//QA1 q1 = new QA1();
		//q1.sum(30, 40);
		q4.QA3IM();
		
	}

	
	public void QA3IM() {
System.out.println("this is QA3I Method");		
		
	}
}
