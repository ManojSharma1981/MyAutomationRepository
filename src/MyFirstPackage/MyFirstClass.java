package MyFirstPackage;

public class MyFirstClass {
	
	int a=10;
	int b=12;
	
	public String Print(){
		return "hello";
		}
	
	public int Total(int x, int y){
		return x+y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFirstClass obj1= new MyFirstClass();
		
		int t=obj1.Total(22, 33);
		System.out.println(t);
		
		
		String p = obj1.Print();
		System.out.println(p);
		
	}

}
