package organisation.cts;

public class google {

	 
		 
		  String name;
		  int age;
		  float dateofbirth;
		  int centuries;
		  long halfCenturies;
		private int halfcenturies;


	      {
	   this.age=22;
	   this.name="sri";
	   this.dateofbirth=22-08-1997
	   this.centuries=5;
	   this.halfcenturies=2;
	   
	    }
	
	   google(Stringn,inta,intb,longc,intd)
	    {
	    	this.age=a;
	        this.name=n;
	        this.dateofbirth=c;
	        this.centuries=b;
	        this.halfcenturies=d;
	    }
		public static void main(String[] args)
		{
			PersonDetails obj1=new PersonDetails();
			PersonDetails obj2=new PersonDetails("sri",22);
			System.out.println(obj1.name+""+obj1.age+""+obj1.dateofbirth+""+obj1.centuries+""+obj1.halfcenturies+"");
			
		

	}

}
