package MyFirstPackage;

public class splitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = new String("This - is my first - split - method");
		String[] splited = str.split("-");
		
		for(String result : splited)
		{
			System.out.println(result);
		}
	}

}
