package day19;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> mh = new LinkedList(); // upcasting
		mh.add("Alice");
		mh.add("Ben");
		mh.add("Chris");
//		
//		System.out.println(mh.peek());
//		System.out.println(mh.size());
//		System.out.println(mh);
		

//		System.out.println(mh.poll());
//		System.out.println(mh.size());
//		System.out.println(mh);
		
		mh.addFirst("Abdul");
		System.out.println(mh);
		
		mh.add(3, "Bharat");
		System.out.println(mh);
		
		System.out.println(mh.removeLast());
		System.out.println(mh);
	}
}
