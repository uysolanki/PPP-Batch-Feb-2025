package day34;

public class DriverApp1 {

	public static void main(String[] args) {
//		Sample2 s1=(rad)->System.out.println(Math.PI*rad*rad);
//		s1.areaCircle(5);
		
		
		Sample2 s2=rad->Math.PI*rad*rad;
		double area=s2.areaCircle(5);
		
		System.out.println(area);
		
		
		Sample2 s3=rad->{return Math.PI*rad*rad;};
		double area1=s3.areaCircle(10);
		
		System.out.println(area1);
		
		
		Sample3 s4=(l,b)->l*b;
		System.out.println(s4.areaRect(10, 5));
	}

}
