package MyFirstPackage;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int row=9;
		for(int i=1;i<=10;i++)
		{
		 for(int k=row;k>0;k--)
		 {
			 System.out.print(" ");
			 
		 }
		 row--;
		 
		 for(int j=1;j<=i;j++)
		 {
			 System.out.print("9");
			 
		 }
		 for(int m=2;m<=i;m++)
		 {
			 System.out.print("8");
		 }
		System.out.println();
		}
	}
	

}
