package MyFirstPackage;

public class PrimeNumber {
	static int num=31;
	int check;
	void CheckPrime(int x)
	{
		for(int i=2;i<x;i++)
		{
			int remainder=x%i;
			if (remainder==0)
			{
			check=check+1;
			}
		}
		
		if (check>0)
				{
					System.out.println("Not Prime");
				}
		else
				{
					System.out.println("Prime");
				}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrimeNumber obj1=new PrimeNumber();
		obj1.CheckPrime(num);

	}

}
