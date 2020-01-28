package CTSdemo;
import java.util.*;
public class Trycatch {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int a;
	try
	{
	a=sc.nextInt();
	
}
catch(Exception e)
{
	System.out.println("Invalid number!");
	a=0;

}
System.out.println("Value of a:" +a);
sc.close();
}
}
