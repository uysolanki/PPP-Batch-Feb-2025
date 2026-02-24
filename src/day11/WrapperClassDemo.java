package day11;

public class WrapperClassDemo {
public static void main(String[] args) {
	
	int a=10;			//primitive, proof we cannot call any function using a
	System.out.println("Primitive "+a);

	Integer obj=new Integer(a);	//--> autoboxing
	System.out.println("Non Primitive "+obj);
	
	int c=obj.intValue();		//--> unboxing
	System.out.println("Primitive "+c);
	
	
	
	String s1="s123";
	String s2="123";
	System.out.println(s1+s2);
	int n1=Integer.parseInt(s1);	//"s123"  -> 123
	int n2=Integer.parseInt(s2);	//123
	System.out.println(n1+n2);
}
}
