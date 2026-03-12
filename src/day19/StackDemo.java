package day19;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) 
	{
		Stack<Integer> stack=new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println(stack.size());
		
		System.out.println(stack.peek());
		System.out.println(stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.size());
	}
}
//solve using stack

//madam Palidrome
//moon Not Palindrome


// "{[()]}"  well formed
// "{([)]}"  not well formed
// ""
// null