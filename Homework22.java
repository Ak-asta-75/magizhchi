class Homework22
{
	public static void main(String[]args)
	{
		int[] arr = {10,20,30,40,50,60,70};
		int tar = 40;
		Homework22 hr = new Homework22();
		int res = hr.linearRe(arr, 0, tar);
		
		if(res != -1)
		{
			System.out.println("Index Value : " + res);
		}
		else
		{
			System.out.println("Index Value is not present");
		}
	}
	
	public static int linearRe(int[] arr, int index, int tar)
	{
		if(index >= arr.length)
		{
			return -1;
		}
		if(arr[index] == tar)
		{
			return index;
		}
		return linearRe(arr, ++index, tar);
	}
}