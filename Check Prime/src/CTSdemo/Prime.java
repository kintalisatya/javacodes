package CTSdemo;

import java.util.Scanner;

public class Prime {
	public static void main(String []args)
	{
	Scanner tc=new Scanner(System.in);
	int a,b=0,i;
	System.out.println("enter a number to check weather prime are not");
	a=tc.nextInt();
	for(i=1;i<a;i++)
	{
	if(a%i==0)
	b++;
	}
	if(b==1)
	System.out.println("given number is a prime");
	else
	System.out.println("given number is a not prime");
	}

}
