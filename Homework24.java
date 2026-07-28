public class Homework24
{
	public static void main(String[] args)
	{
        int[] arr = {5, 1, 4, 2, 8, 3};
        int passes = bubbleSort(arr);
        printArray(arr);
        System.out.println("Number of Passes: " + passes);
    }
    public static int bubbleSort(int[] arr)
	{
        int passes = 0;

        for (int i = 0; i < arr.length - 1; i++)
		{
            passes++;
            
            for (int j = 0; j < arr.length - 1; j++)
			{
                if (arr[j] > arr[j + 1])
				{
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return passes;
    }
    public static void printArray(int[] arr)
	{
        System.out.println("Sorted Array:");
        for (int i = 0; i < arr.length; i++)
		{
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}