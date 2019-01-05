package MyFirstPackage;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="This is Ram";
		
		int len=str1.length()-1;
		
		//System.out.println(len);
		
		String rev=" ";
		
		for(int i=len;i>=0;i--)
		{
			rev=rev+str1.charAt(i);		
			System.out.println(rev);
		}

	}

}
