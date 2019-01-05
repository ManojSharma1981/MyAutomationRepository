package MyFirstPackage;

public class ChildClass implements GrandParent{
	public void GP(){
		System.out.println("coming from Child class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildClass obj = new ChildClass();
		obj.GP();
		
		ParentClass obj1 = new ParentClass();
		obj1.GP();
		
		
	}

}
