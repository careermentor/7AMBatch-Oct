package testPkg;

public class CallInterface implements MyInterfaceDemo
{

	
	public void meth3() {
	System.out.println("this is method of interface");
		
	}

	public static void main(String[] args) {
		CallInterface ci = new CallInterface();
		ci.meth3();
	}
	
}
