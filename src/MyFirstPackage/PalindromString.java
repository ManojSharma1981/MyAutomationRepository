package MyFirstPackage;

public class PalindromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="NITiNNITIN";
		String str2=str1.toUpperCase();
		System.out.println(str2);
		
		
		int len=str2.length();
		int res=0;
		for(int i=0;i<len-1;i++)
		{
			if(str2.charAt(i)!=str2.charAt(len-1))
					{
						res++;
					}
			len--;
			
		}
		if (res==0)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}		
			
				
		}
	}


