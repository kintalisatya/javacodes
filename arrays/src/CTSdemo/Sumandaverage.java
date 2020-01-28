package CTSdemo;
import java.util.Scanner;
public class Sumandaverage
{
public static void main(String[] args)
{
	int n,sum=0;
	float average;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the elementsin the array ");
	n=sc.nextInt();
	int a[] =new int[n];
	System.out.println("enter all elements");
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
		sum=sum+a[i];
	}
	System.out.println("sum:" +sum);
	average=(float)sum/n;
	System.out.println("Average:" + average);
}
}
