package day27.dsa;

public class CBRDemo2 {
public static void main(String[] args) {
	int a=10;
	Integer aobj=new Integer(a);
	System.out.println("A = "+aobj);  //A=10
	demo(aobj);
	System.out.println("A = "+aobj);  //A=99
}

private static void demo(Integer bobj) 
{
	System.out.println("B = "+bobj);	//B=10
	bobj=bobj.valueOf(99);
	System.out.println("B = "+bobj);	//B=99
}
}
