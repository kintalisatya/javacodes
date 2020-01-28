package CTSdemo;

public class ArrayName 
{
	/*public static void main(String[]args)
	{
	 int k[]= {1,2,3,4,5,6};
	 for(int i=0;i<7;i++)
	 System.out.print(k[i] +"  \n " );
	}
}*/

	public static void main(String[] args)
	{
		int d=2;
		int n=20;
	try
	{
		int fraction=n/d;
		System.out.println("this line will not be excuted");
}
	catch(ArithmeticException e)
	{
	System.out.println("in the block due to exception=" + e);
	}
	

	finally
	{
		System.out.println("Inside the finally");
	}
}
}
