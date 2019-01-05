package MyFirstPackage;

public class IntterfaceClass1 implements FirstInterface   {
	public void meth1(){
		System.out.println("meth1");
	}
	
	
	public void meth3(){
		System.out.println("meth3");
	}
	
	
	public void meth2(){
		System.out.println("meth2");
	}
	
	public void self()
	{
		int a=10+30;
		System.out.println(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirstInterface obj1 = new IntterfaceClass1();
		obj1.meth1();
		
	}

}
