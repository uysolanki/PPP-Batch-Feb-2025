package day1;

public class DriverApp {

	public static void main(String[] args) {
		
		Amitabh a1;
		
		Abhishek a2;
		
		Aradhya a3;
		
		a1=new Amitabh();
		a1.home();				//Jalsa
		
		a1=new Abhishek();		//New Jalsa
		a1.home();
		
		a1=new Aradhya();		//New Jalsa
		a1.home();
		
		
		a2=new Abhishek();
		a2.home();				//New Jalsa
		a2.car();				//Audi
		a2=new Aradhya();
		a2.home();				//New Jalsa
		a2.car();				//Audi
		
		
		a3=new Aradhya();
		a3.home();			 	//New Jalsa
		a3.car();				//Audi
		a3.office();			//Bandra Office
		
		
		//Abhishek a4=(Abhishek) new Amitabh();
		
//		int sellingPrice=8;
//		double printSellingPrice=sellingPrice;			//widning  implicilty type conversion
//		
//		System.out.println("INT "+ sellingPrice);
//		System.out.println("DOUBLE "+ printSellingPrice);
		
		
//		double sellingPrice=8.75;
//		int printsellingPrice=(int)sellingPrice;		//narrowing  explicilty type conversion
//					
//		
//		System.out.println("DOUBLE "+ sellingPrice);
//		System.out.println("INT "+ printsellingPrice);
		
		
		int age=23;
		String name="Alice";
		double height=5.10;
		
		//System.out.println("My Name is " +name+ " I am " +age+  " years old and I am "+height+ " feet tall");
		
		System.out.println(String.format("My Name is %s I am %d years old and I am %.2f feet tall", name,age,height));
		
		System.out.println(String.format("My Name is %s I am %d years old and I am %.2f feet tall", name,getAge(),height));
		
		System.out.println(String.format(getString(), name,getAge(),height));
		printBillOptionA();
		printBillOptionB();
	}
	
	public static int getAge()
	{
		return 25;
	}
	
	public static String getString()
	{
		return "My Name is %s I am %d years old and I am %.2f feet tall";
	}
	
	public static void printBillOptionA()
	{
		System.out.println("Shirt" + 500);
		System.out.println("Trouser" + 700);
		System.out.println("Tie" + 1000);
		System.out.println("Total" + 2200);
				
	}
	
	public static void printBillOptionB()
	{
		System.out.println(String.format("%-10s%4d","Shirt",500));
		System.out.println(String.format("%-10s%4d","Trouser",700));
		System.out.println(String.format("%-10s%4d","Tie",1000));
		System.out.println(String.format("%-10s%4d","Total",2200));
				
	}
}

//My Name is Alice I am 23 years old and I am 5.10 feet tall