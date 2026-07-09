class Homework12 
{
	public static void main(String[]args)
	{
		int a = 987;
		int b = 0;
		while(a != 0)
		{
			a = a/10;
			b++;
		}
		System.out.println("Number = "+a);
		System.out.println("Number of digits = "+b);
	}
}