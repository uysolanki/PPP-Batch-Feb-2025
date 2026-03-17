package day23;

public class MyCircularQueue {

	int queue[]=new int[5];
	int rear=-1;
	int front=0;
	int counter=0;
	public void display() {
		
			if(front>rear)
			{
			for(int i=front;i<queue.length;i++)
				System.out.println(queue[i]);
			for(int i=0;i<=rear;i++)
				System.out.println(queue[i]);
			}
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
			int data=queue[front];
			front=(front+1)%queue.length;
			System.out.println(data + " is Removed");
		}
		counter--;
	}

	public void insert(int data) {
		if(isFull() && rear!=-1)
			System.out.println("Queue is Full");
		else
		{
			rear=(rear+1)%queue.length;
			queue[rear]=data;
		}
		
		counter++;
	}
	
	public boolean isEmpty() 
	{
		if(counter==0)
			return true;
		else
			return false;
			
	}
	

	public boolean isFull() 
	{
		if(counter==queue.length)
			return true;
		else
			return false;
			
	}
}
