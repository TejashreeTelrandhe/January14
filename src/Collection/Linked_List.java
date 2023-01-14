package Collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Linked_List {

	public static void main(String[] args) {
//		1. Duplicate are allowed in LinkedList
//		2. Allows multiple of null values
//		3. Order of insertion-maintain
//		4. No Default capacity in linkedlist
//		5. Data structure: linear
//		7. Best choice: manipulation operation i.e. insertion in between linkedlist or delete ()
//		8. Worst choice: retrieval operation
//		9. Storage type: index
		
LinkedList link = new LinkedList();
link.add("list");
link.add("set");
link.add("queue");
link.add("queue");
link.add('A');
link.add(null);
link.add(true);
System.out.println(link);
link.add("deque");
System.out.println(link);
link.remove(1);
System.out.println(link);
link.set(0, "hashset");
System.out.println(link);

System.out.println(link.get(1));//queue
System.out.println(link.getFirst());//hashset
System.out.println(link.getLast());//deque
System.out.println(link.isEmpty());
System.out.println();

LinkedList <String> link1 = new LinkedList <String> ();
link1.addAll(link);
System.out.println(link1);
link1.removeAll(link);
System.out.println(link1);
System.out.println(link1.isEmpty());
System.out.println(link.contains("deque"));//true
System.out.println(link.contains("linkedlist"));//false
System.out.println();

// print all value
for(Object s :link) {
	System.out.println(s);
}
System.out.println();

Iterator it =link.iterator();
while(it.hasNext()) {
	System.out.println(it.next());
}
System.out.println();

Collections.shuffle(link);
System.out.println(link);
Collections.sort(link);
System.out.println(link);
Collections.sort(link, Collections.reverseOrder());
System.out.println(link);
}
	
}
