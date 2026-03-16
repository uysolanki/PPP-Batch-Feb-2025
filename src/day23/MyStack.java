package day23;

public class MyStack {

	int stack[]=new int[5];
	int top=-1;
	
	public void display() {
		if(isEmpty())
			System.out.println("Stack is Empty, Nothing to Display");
		else
		{
			for(int i=top;i>=0;i--)
				System.out.println(stack[i]);
		}
		
	}

	public void pop() {
		if(isEmpty())
			System.out.println("Stack is Empty");
		else
		{
			int data=stack[top];
			System.out.println(data + " is Poped");
			top--;
		}
		
	}

	public void push(int data) {
		if(isFull())
			System.out.println("Stack is full");
		else
		{
			top++;
			stack[top]=data;
		}
		
	}
	
	public boolean isEmpty() 
	{
		if(top==-1)
			return true;
		else
			return false;
			
	}
	
	public boolean isFull() 
	{
		if(top==stack.length-1)
			return true;
		else
			return false;
			
	}

	
}
