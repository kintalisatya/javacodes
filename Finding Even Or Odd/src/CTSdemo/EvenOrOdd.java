package CTSdemo;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[]args)
	{
	Scanner tc=new Scanner(System.in);
	int a,b;
	System.out.println("enter a number find even or add");
	a=tc.nextInt();
	tc.close();
	if(a%2==0)
	{
	System.out.println("enterd number is even number");
	}
	else
	{
	System.out.println("enterd number is odd number");
	}
	}

}
