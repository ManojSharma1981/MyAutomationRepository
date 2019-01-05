package MyFirstPackage;

public class Box {
	final int l=33;
	int b;
	int h;
	
	Box(int x, int y, int z){
		//l=x;
		b=y;
		h=z;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box sbox = new Box(20,30,40);
		System.out.println(sbox.l);
		System.out.println(sbox.b);
		System.out.println(sbox.h);
		
		Box mbox = new Box(200,300,400);
		System.out.println(mbox.l);
		System.out.println(mbox.b);
		System.out.println(mbox.h);
		
		Box bbox = new Box(2000,3000,4000);
		System.out.println(bbox.l);
		System.out.println(bbox.b);
		System.out.println(bbox.h);
		
		
		
		
		
		
		

	}

}
