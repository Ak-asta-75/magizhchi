class Homework20
{
	public static void main(String[]args)
	{
		int [] arr = {10,20,30,40,50};
		System.out.print("Array elements: ");
        for (int num : arr)
		{
            System.out.print(num + " ");
        }
        System.out.println();
		int target = 30;
		int linearRes = linearSearch(arr, target);
		System.out.println("Linear Index : " + linearRes);
		int binaryRes = binarySearch(arr, target);
		System.out.println("Binary Index : " + binaryRes);
		
	}
	static int linearSearch(int[] ar, int target)
	{
		for(int i =0; i < ar.length; i++)
		{
			if(ar[i] == target)
			{
				return i;
			}
		}
		return -1;
	}
	static int binarySearch(int[] ar, int target)
	{
		int low = 0;
		int high = ar.length - 1;
		while (low <= high)
		{
			int mid = low + (high - low)/2;
			if(ar[mid] == target)
			{
				return mid;
			}
			else if(ar[mid] < target)
			{
				low = mid + 1;
			}
			else
			{
				high = mid - 1;
			}
		}
		return -1;
	}
}