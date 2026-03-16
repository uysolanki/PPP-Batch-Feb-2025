package day22;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueDemo2 {

	public static void main(String[] args) {

		PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());	 //max heap
		pq.add(8);
		pq.add(2);
		pq.add(3);
		pq.add(7);
		pq.add(5);
		
		int highest=pq.remove(); //highest=8;
		int secondHighest=pq.remove(); //highest=7;
		System.out.println(highest+secondHighest);
	}

}

//bag [7,8,2,3,5]  
//hand           bag
//8,7            2,3,5
//crush          2,3,5,1
//5,3            2,1
//crush          2,1,2
//2,2            1
//crush          1
