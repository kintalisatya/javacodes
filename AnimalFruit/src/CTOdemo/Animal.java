package CTOdemo;
class KingKakku
{
void piggy()
{
	System.out.println("king kajju()");
}
}
class Piggy extends KingKakku
{ void piggy()
{
System.out.println("sharon");	
}
}

public class Animal {
public static void main(String[]args)
    {
	KingKakku pk=new KingKakku();
	pk.piggy();
	KingKakku sk= new Piggy();
	sk.piggy();
	
	
	}
}
