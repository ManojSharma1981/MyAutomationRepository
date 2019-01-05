package MyFirstPackage;

public class AbstInheritClass1 extends AbstClass {
	
	void Sum(){
		System.out.println("Sum");
	}
	
	void funct3(){
		System.out.println("Shyam");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstInheritClass1 obj1 = new AbstInheritClass1();
		obj1.funct1();
		obj1.Sum();
		obj1.funct2();
		obj1.funct3();

	}

}
