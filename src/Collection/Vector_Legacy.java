package Collection;

import java.util.Iterator;
import java.util.Vector;

public class Vector_Legacy {

	public static void main(String[] args) {
//		1. Duplicate are allowed in vector
//		2. Allows multiple of null values
//		3. Order of insertion-maintain
//		4. Default capacity for Vector is 10
//		5. Data structure: doubly
//		6. Incremental capacity= current capacity*2
//		7. Best choice: retrieval operation 
//		8. Worst choice: manipulation operation i.e. insertion in between Vector or delete ()
//		9. Vector is legacy class.
//		10. Storage type: index
		
Vector <Integer> vec = new Vector<Integer>();
vec.add(101);
vec.add(102);
vec.add(103);
vec.add(106);
vec.add(null);
vec.add(null);
vec.add(106);
System.out.println(vec);

System.out.println(vec.size());//7

vec.add(5, 104);
System.out.println(vec);

vec.set(4, 105);
System.out.println(vec);

vec.remove(1);
System.out.println(vec);

System.out.println(vec.contains(101));
System.out.println(vec.contains(109));

System.out.println(vec.isEmpty());

Vector<Object> vec1 = new Vector<Object>();
vec1.addAll(vec);
System.out.println(vec1);

System.out.println(vec1.size());//7

vec1.removeAll(vec);
System.out.println(vec1);

vec1.addAll(vec);
System.out.println(vec1);

System.out.println(vec.indexOf(106));//2
System.out.println(vec.indexOf(108));//-1
//Returns the index of the first occurrence of the specified element
//in this vector, or -1 if this vector does not contain the element.

System.out.println(vec.lastIndexOf(105));//3
System.out.println(vec1.lastIndexOf(106));//6
//Returns the index of the last occurrence of the specified element
//in this vector, or -1 if this vector does not contain the element.
System.out.println();

//Print all value
for(Integer i :vec) {
	System.out.println(i);
}
System.out.println();
 Iterator it = vec1.iterator();
while(it.hasNext()) {
	System.out.println(it.next());
}
System.out.println();
for(int ii =0;ii<vec.size();ii++) {
	System.out.println(vec.get(ii));
}
	}

}
