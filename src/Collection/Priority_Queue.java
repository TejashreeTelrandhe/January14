package Collection;

import java.util.PriorityQueue;

public class Priority_Queue {

	public static void main(String[] args) {
//   Insertion order is not preserved
//   Duplicate are allowed
//	 Homogenous type of data
		
		PriorityQueue pq = new PriorityQueue();
		pq.add('A');
		pq.add('Q');
		pq.add('D');
		pq.add('<');
		pq.add('%');
		pq.add('S');
		pq.add('P');
		System.out.println(pq);
		pq.offer('Y');//Inserts the specified element into this priority queue.
		pq.offer('W');
		pq.offer('L');
		System.out.println(pq);
//		pq.offer(100);
//		System.out.println(pq);//ClassCastException
		PriorityQueue pqs = new PriorityQueue();
		System.out.println(pq.isEmpty());
		System.out.println();
		for(Object obj:pq) {
			System.out.println(obj);
		}
		System.out.println();

//      Head Element : Elements  and Peek
		System.out.println(pq.element());//%
//		System.out.println(pqs.element());//NoSuchElementException
		System.out.println(pq.peek());//%
		System.out.println(pqs.peek());//null
		
//		 Remove and Poll
		System.out.println(pq.remove());//%
//		System.out.println(pqs.remove());//NoSuchElementException
		System.out.println(pq.poll());//<
		System.out.println(pqs.poll());//null
		
		
	}

}
