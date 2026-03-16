package day23;

public class MyQueue {

	int queue[]=new int[5];
	int rear=-1;
	int front=0;
	
	public void display() {
		if(isEmpty())
			System.out.println("Queue is Empty, Nothing to Display");
		else
		{
			for(int i=front;i<=rear;i++)
				System.out.println(queue[i]);
		}
		
	}

	public void remove() {
		if(isEmpty())
			System.out.println("Queue is Empty");
		else
		{
			int data=queue[front++];
			System.out.println(data + " is Removed");
		}
		
	}

	public void insert(int data) {
		if(isFull())
			System.out.println("Queue is full");
		else
			queue[++rear]=data;
		
	}
	
	public boolean isEmpty() 
	{
		if(front>rear)
			return true;
		else
			return false;
			
	}
	
	public boolean isFull() 
	{
		if(rear==queue.length-1)
			return true;
		else
			return false;
			
	}

	
}
