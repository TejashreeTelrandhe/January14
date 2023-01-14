package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class Hash_Set {

	public static void main(String[] args) {
//		1. Doesn't allow duplicate values
//		2. Allow only 1 null value.
//		3. Order of insertion-random insertion
//		4. No default capacity
//		5. DS: Hashtable
//		6. Storage type: hashtable
//		7. Best choice: To remove duplicate elements when order of insertion is not mandatory.
		HashSet <Character> HS = new HashSet<Character>();
		HS.add('A');
		HS.add('C');
		HS.add('A');
		HS.add('D');
		HS.add('E');
		HS.add('B');
		HS.add(null);
		HS.add('F');
		HS.add(null);
		HS.add('G');
System.out.println(HS);//[null, A, B, C, D, E, F, G]

System.out.println(HS.size());//8

System.out.println(HS.contains('S'));
System.out.println(HS.contains('A'));

System.out.println(HS.isEmpty());

HS.remove('E');
System.out.println(HS);//[null, A, B, C, D, F, G]
System.out.println();

//Print all value
Iterator it = HS.iterator();
while(it.hasNext()) {
	System.out.println(it.next());
}
System.out.println();
HashSet <Character> HS1 = new HashSet<Character>();
HS1.addAll(HS);
System.out.println(HS1);
HS1.removeAll(HS);
System.out.println(HS1);

HS.clear();
System.out.println(HS);//[]
System.out.println();

HashSet <Integer> HS2 = new HashSet<Integer>();
HS2.add(100);
HS2.add(101);
HS2.add(102);
HS2.add(103);
HS2.add(104);
HS2.add(105);
HS2.add(106);
HS2.add(107);
HS2.add(108);
HS2.add(109);
System.out.println(HS2);

HashSet <Integer> HS3 = new HashSet<Integer>();
HS3.add(109);
HS3.add(101);
HS3.add(110);
HS3.add(103);
HS3.add(104);
HS3.add(108);
HS3.add(107);
System.out.println(HS3);
System.out.println();

HS2.addAll(HS3);
System.out.println("Union:"+HS2);// only unique value is displayed

HS2.retainAll(HS3);
System.out.println("Common:"+HS2);//only common values displayed

System.out.println(HS2.containsAll(HS3));//true
System.out.println(HS3.containsAll(HS2));//true
}
}
