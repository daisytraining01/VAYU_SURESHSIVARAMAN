package Project;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Test7 {
	public static void main(String[] args) {
		List<String> aList1 = new ArrayList<String>();
	      aList1.add("TestVal1");
	      aList1.add("TestVal2");
	      aList1.add("TestVal1");
	      aList1.add("TestVal2");
	      aList1.add("TestVal2");
	      aList1.add("TestVal3");    
	      HashSet h = new HashSet(aList1);
	      List<String> aList2 = new ArrayList(h);
	   for (String i : aList2)
	         System.out.println(i);
	   }
	

}


/*Output
  TestVal1
  TestVal2
  TestVal3
*/