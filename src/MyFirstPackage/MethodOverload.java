package MyFirstPackage;

public class MethodOverload {
	
	void Area(int l, int b)
	{
		int rectarea=l*b;
		System.out.println("area of rectangle--->" + rectarea);
	}
	
	void Area(int r)
	{
		double circlearea=3.14*r*r;
		System.out.println("area of circle--->" + circlearea);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverload obj1 = new MethodOverload();
		obj1.Area(3);
		obj1.Area(8, 9);
	}

}
