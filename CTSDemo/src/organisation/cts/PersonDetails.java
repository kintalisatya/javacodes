package organisation.cts;

public class PersonDetails {

	 
	  
	public static final String halfcenturies = null;
	int age;
	  String name;
	public String dateofbirth;
	public String centuries;
      PersonDetails()
      {
   this.age=22;
   this.name="sri";
   
    }
    PersonDetails(String n,int a)
    {
    	this.age=a;
        this.name=n;
    }
	public static void main(String[] args)
	{
		PersonDetails obj1=new PersonDetails();
		PersonDetails obj2=new PersonDetails("sri",22);
		System.out.println(obj1.name+""+obj1.age);
		
	}

}
