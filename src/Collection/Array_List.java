package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Array_List {
public static void main(String[] args) {
//	1. Duplicate are allowed in Arraylist
//	2. Allows any no of null values
//	3. Order of insertion-maintain
//	4. Default capacity for arraylist is 10
//	5. Data structure: Resizable
//	6. Incremental capacity= (current capacity*3/2) +1
//	7. Best choice: retrieval operation 
//	8. Worst choice: manipulation operation i.e. insertion in between arraylist or delete ()
//	9. Storage type: index
	
	ArrayList arrlist = new ArrayList();
	arrlist.add("DEV");
	arrlist.add("SIT");
	arrlist.add("UAT");
	arrlist.add("PROD");
	arrlist.add("ENDTOEND");
	System.out.println(arrlist);
//	Print size 
	System.out.println(arrlist.size());
//	Remove
	arrlist.remove(0);
	System.out.println(arrlist);
//	Insert
	arrlist.add(0, "Environment");
	System.out.println(arrlist);
	arrlist.add(1, "QA analysis");
	System.out.println(arrlist);
//	Retrieve specific element
	System.out.println(arrlist.get(0));
	System.out.println(arrlist.get(5));
//	Replace
	arrlist.set(2,"Unit testing");
	System.out.println(arrlist);
	arrlist.set(3,"Integration testing");
	System.out.println(arrlist);
	
//	Contains
	System.out.println(arrlist.contains("Bottom up apprach"));
	System.out.println(arrlist.contains("UAT"));
	System.out.println();
//	Print all the values in the array
	for(int i =0;i<=arrlist.size()-1;i++) {
		System.out.println(arrlist.get(i));
	}
	System.out.println();
	for(Object obj:arrlist) {
		System.out.println(obj);
	}
	System.out.println();
	Iterator it = arrlist.iterator();//Returns an iterator over the elements in this list in proper sequence.
	while(it.hasNext()) {
//	Returns true if the iteration has more elements.(In other words, returns true if next would 
//	return an element rather than throwing an exception.)
    System.out.println(it.next());//Returns the next element in the iteration.
	}
	System.out.println();
	ArrayList <String> array  = new ArrayList<String>();
	array.addAll(arrlist);	
	System.out.println(array);
	array.removeAll(arrlist);
	System.out.println(array);
	System.out.println();
//	Collections
	Collections.sort(arrlist);
	System.out.println(arrlist);
	Collections.shuffle(arrlist);
	System.out.println(arrlist);
	Collections.sort(arrlist, Collections.reverseOrder());
	System.out.println(arrlist);
	System.out.println();
	
//	Array into arraylist
	String arr1[] = {"A","B","C"};
	for(String ii:arr1) {
		System.out.println(ii);
	}
	ArrayList al = new ArrayList (Arrays.asList(arr1));
//  Returns a fixed-size list backed by the specified array. 
	System.out.println(al);

}
}
