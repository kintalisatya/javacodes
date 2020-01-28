package CTSdemo;

class ArrayofObj {
	public int emp_id;
	public String emp_name ;
	ArrayofObj(String emp_name,int emp_id)
	 {
		 this.emp_id=emp_id;
		 this.emp_name=emp_name;
	 }
	}
		 public class EmployeName
		 {	 
	 public static void main(String[] args)
	 {
		 ArrayofObj[] employeearray;
		  employeearray = new ArrayofObj[6];
		 employeearray[0]=new ArrayofObj("satya",1);
		 employeearray[1]=new ArrayofObj("madhu",2);
		 employeearray[2]=new ArrayofObj("ragini",3);
		 employeearray[3]=new ArrayofObj("riyaz",4);
		 employeearray[4]=new ArrayofObj("arumugam",5);
		 employeearray[5]=new ArrayofObj("sound",6);
	 for(int i=0;i<employeearray.length;i++)
		 System.out.print( employeearray[i].emp_id+":"+employeearray[i].emp_name+" ");
	 
	 }}
	 
