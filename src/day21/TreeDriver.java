package day21;

import java.util.Scanner;

public class TreeDriver {

	public static void main(String[] args) {
	Node root=null;
	root=createTree(root);			//call pass null
	System.out.print("InOrder : ");
	inOrder(root);
	System.out.println();
	System.out.print("PreOrder : ");
	preOrder(root);
	System.out.println();
	System.out.print("PostOrder : ");
	postOrder(root);
	}

	private static void inOrder(Node root) {
		if(root!=null)
		{
			inOrder(root.getLeft());
			System.out.print(root.getData()+",");
			inOrder(root.getRight());
		}
		
	}
	
	private static void preOrder(Node root) {
		if(root!=null)
		{
			System.out.print(root.getData()+",");
			preOrder(root.getLeft());
			preOrder(root.getRight());
		}
		
	}
	
	private static void postOrder(Node root) {
		if(root!=null)
		{
			postOrder(root.getLeft());
			postOrder(root.getRight());
			System.out.print(root.getData()+",");
			
		}
		
	}

	private static Node createTree(Node root) {
		int ans=0;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("Enter Data for the Node");
			int item=sc.nextInt();		//item=150
			Node nn=new Node(item);
			if(root==null)
			{
				root=nn;
			}
			else
			{
				insertNode(root,nn);
			}
			
			System.out.println("Do you wish to continue inserting more nodes? 1-Yes 0-No");
			ans=sc.nextInt();	
		}while(ans==1);
		return root;
	}

	private static void insertNode(Node root, Node nn) 		//root			nn
	{														//3000			4000
		
		if(nn.getData() > root.getData())
		{
			if(root.getRight()==null)
				root.setRight(nn);								//right side
			else
				insertNode(root.getRight(),  nn);
		}
		else
		{
			if(root.getLeft()==null)
				root.setLeft(nn);										//left side
			else
				insertNode(root.getLeft(),  nn);
		}
	}

}


//100,150,75,50,60,25,125

/*
Enter Data for the Node
100
Do you wish to continue inserting more nodes? 1-Yes 0-No
1
Enter Data for the Node
150
Do you wish to continue inserting more nodes? 1-Yes 0-No
1
Enter Data for the Node
75

Do you wish to continue inserting more nodes? 1-Yes 0-No
1
Enter Data for the Node
50
Do you wish to continue inserting more nodes? 1-Yes 0-No
1
Enter Data for the Node
60
Do you wish to continue inserting more nodes? 1-Yes 0-No
1
Enter Data for the Node
125
Do you wish to continue inserting more nodes? 1-Yes 0-No
1
Enter Data for the Node
25
Do you wish to continue inserting more nodes? 1-Yes 0-No
*/