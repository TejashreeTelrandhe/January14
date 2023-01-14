package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linked_HashSet {

	public static void main(String[] args) {
//		1. Doesn't allow duplicate values
//		2. Allow only 1 null value.
//		3. Order of insertion-maintained
//		4. Default capacity is 16 & Load factor is 0.75 or 75%
//		5. DS: Hybrid (liner+ hashtable)
//		6. Storage type: hashtable
//		7. Best choice: To remove duplicate elements when order of insertion is mandatory
		
		LinkedHashSet <Integer> LHS = new LinkedHashSet <Integer>();
		
		LHS.add(null);
		LHS.add(12);
		LHS.add(11);
		LHS.add(19);
		LHS.add(45);
		LHS.add(19);
		LHS.add(13);
		LHS.add(14);
		System.out.println(LHS);
		System.out.println(LHS.size());
		
		LHS.remove(14);
		System.out.println(LHS);
		
		System.out.println(LHS.contains(45));
		
		System.out.println(LHS.isEmpty());
       Iterator it = LHS.iterator();
       while(it.hasNext()) {
    	   System.out.println(it.next());
       }
		LHS.clear();
		System.out.println(LHS);
	}

}
