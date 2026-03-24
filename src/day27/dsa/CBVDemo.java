package day27.dsa;

public class CBVDemo {
public static void main(String[] args) {
	int a=10;
	System.out.println("A = "+a);  //A=10
	demo(a);
	System.out.println("A = "+a);  //A=10
}

private static void demo(int b) 
{
	System.out.println("B = "+b);	//B=10
	b=99;
	System.out.println("B = "+b);	//B=99
}
}
