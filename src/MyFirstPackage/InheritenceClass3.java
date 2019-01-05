package MyFirstPackage;

public class InheritenceClass3 extends InheritenceClass2 {
		int a;
		int b;
		int c;
		
		String Print(){
			return "From Class C";
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritenceClass3 obj1=new InheritenceClass3();
		String a1=obj1.Print();
		System.out.println(a1);
		String a2=obj1.Print1();
		System.out.println(a2);
		
		InheritenceClass3 obj2 = new InheritenceClass3();
		obj2.add(10, 20);
		obj2.add("Manoj12", "Sharma");
		
		
		
	}

}
