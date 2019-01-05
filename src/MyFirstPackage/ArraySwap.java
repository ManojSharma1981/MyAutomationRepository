package MyFirstPackage;

public class ArraySwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={100,200,300,400,500};
		 System.out.println("original array");
		for(int i=0;i<(arr.length);i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("length of array");
		int len=arr.length;
		System.out.println(len);
		
		System.out.println("swapped array");
		for(int i=0;i<=(arr.length)/2;i++)
		{	
			int temp=arr[i];
			arr[i]=arr[len-1];
			arr[len-1]=temp;
			
			len--;
				
		}
		
		for(int i=0;i<(arr.length);i++)
		{
			System.out.println(arr[i]);
		}
	}

}
