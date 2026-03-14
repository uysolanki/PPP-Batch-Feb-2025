package day22;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
//		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();	 //default min heap
//		pq.add(8);
//		pq.add(2);
//		pq.add(3);
//		pq.add(7);
//		pq.add(5);
//		System.out.println(pq);  //[2...]
//		System.out.println(pq.size());  //5
//		System.out.println(pq.remove()); //
//		System.out.println(pq); //[3...]
//		System.out.println(pq.size());  //4
//		System.out.println(pq.remove()); //
//		System.out.println(pq);
		
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());	 //max heap
		pq.add(8);
		pq.add(2);
		pq.add(3);
		pq.add(7);
		pq.add(5);
		System.out.println(pq);  //[2...]
		System.out.println(pq.size());  //5
		System.out.println(pq.remove()); //
		System.out.println(pq); //[3...]
		System.out.println(pq.size());  //4
		System.out.println(pq.remove()); //
		System.out.println(pq);

	}

}
