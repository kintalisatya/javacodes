package CTSdemo;

public class Finally {
public static void main(String[] args)
{
	String input1="abc";
	String input2="1234";
	try
	{
		int d=20;
		int n=0;
		int fraction=d/n;
	}
	catch(ArithmeticException e)
	{
		System.out.println("in the catch block due to exception =" +e);
	}
	finally
	{
		System.out.println("Inside the finally block");
	}
}
}
