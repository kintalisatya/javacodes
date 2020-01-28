
import java.util.ArrayList;
public class Arreylist {
public static void main(String[]args)
         { 
	         ArrayList<String>  list1 =new ArrayList<>();
	         list1.add("Satyanarayana");
	         list1.add("Sharon");
	         list1.add("navya");
	         list1.add("anna");
	         list1.add("angel");
	         ArrayList<String> list2 = new ArrayList<>();
	         list2.add("teja");
	         list2.add("ram prasad");
	         System.out.println(list1);
	         System.out.println(list2);
	         list1.addAll(list2);
	         System.out.println(list1);
         }
}
