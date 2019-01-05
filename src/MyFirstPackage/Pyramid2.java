package MyFirstPackage;

public class Pyramid2 {

	public static void main(String[] args) {
		
	int i,j,k,l;
		
		for(i=1;i<=10;i++)
		{
		 for(k=9;k>=i;k--)
		 {
			 System.out.print(" ");
		 }
				 
		 for(j=1;j<=i;j++)
		 { 
			 System.out.print("*");
			 
		 }
		 
		 for(l=2;l<=i;l++)
		 {
			 System.out.print("*");
		 }
			 
		System.out.println("");
		}
	}

}
