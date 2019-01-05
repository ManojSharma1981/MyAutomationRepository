package MyFirstPackage;

public class ClassC {
	
	public ClassB MetC(){
	return new ClassB();
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassC objC = new ClassC();
		int p1=objC.MetC().MetB().a;
		int p2=objC.MetC().MetB().b;
		int p3=objC.MetC().MetB().Sum(2000, 3000);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

	}

}