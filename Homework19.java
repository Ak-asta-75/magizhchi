class Homework19
{
	public static void main(String[]args)
	{
		int [] arr = {5,10,15,20,30,35};
		int index = 4;
		int value = 25;
		for(int i = 0; i<arr.length;i++)
		{
			System.out.print(arr[i]+",");
		}
		
		System.out.println();
		int [] brr = new int[arr.length+1];
		
		for(int i = 0; i<index; i++)
		{
			brr[i] = arr[i];
		}
		
		brr[index] = value;
		
		for(int i = index + 1; i<brr.length; i++)
		{
			brr[i] = arr[i - 1];
		}
		
		for(int i = 0; i<brr.length;i++)
		{
			System.out.print(brr[i]+",");
		}
		
	}
}