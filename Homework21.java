import java.util.Scanner;

class Homework21
{
	public static void main(String[]args)
	{
		Scanner cs = new Scanner(System.in);
		System.out.println("Enter size of Array : ");
		int a = cs.nextInt();
		int[] arr = new int[a];
		System.out.println("Enter elements : ");
		for(int i = 0; i < a; i++)
		{
			arr[i] = cs.nextInt();
		}
		int b;
		do
		{
		    System.out.println();
		    System.out.println("~~~~~~~~~~~~~");
		    System.out.println(" Array Menue");
		    System.out.println("~~~~~~~~~~~~~");
		    System.out.println("1.Even only");
		    System.out.println("2.Divisible by 5");
		    System.out.println("3.Count of 20");
		    System.out.println("4.Exit");
		
		    b = cs.nextInt();
		    System.out.println();
		    if(b == 1)
		    {
		    	evenNo(arr);
		    }
		    else if(b == 2)
		    {
		    	divi5(arr);
		    }
		    else if(b == 3)
		    {
		    	count20(arr);
		    }
			else if(b == 4)
		    {
		    	System.out.println("Exiting");
		    }
		    else
		    {
		    	System.out.println("Enter the number between 1 - 4");
		    }
		}
		while(b != 4);
		cs.close();
	}
	
	public static void evenNo(int[] arr)
	{
		System.out.println("Even no. : ");
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] % 2 == 0)
			{
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
	}
	public static void divi5(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] % 5 == 0)
			{
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
	}
	public static void count20(int[] arr)
	{
		int cnt = 0;
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == 20)
			{
				cnt++;
			}
		}
		System.out.println("count : " + cnt);
		System.out.println();
	}
}