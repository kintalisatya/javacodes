package Details;

public class Details {
	int Age,hun,fity;
	String playername,playDOB;
	Details()
	{
		this.playDOB= "05.07.1998";
		this.playername="Satya";
		this.Age=20;
		this.hun=5;
		this.fity=29;
	}
	Details(String a,String b,int C,int d,int e )
	{this.playername=a;
	this.playDOB=b;
	this.Age=C;
	this.hun=d;
	this.fity=e;	
	}
	public static void main(String[]arg)
	{ Details pk=new Details();
	Details sk= new Details("satya","05/07/1998",20,6,54 );
	System.out.println(sk.playDOB+" "+sk.playername+" "+sk.Age+" "+sk.hun+" "+sk.fity);
	System.out.println(pk.playDOB+" "+pk.playername+" "+pk.Age+" "+pk.hun+" "+pk.fity);
	
	}
}
