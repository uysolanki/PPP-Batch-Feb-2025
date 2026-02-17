package day7;

public class Person {
		String name;
		int age;
		double height;
		public boolean domicileMh;
		
//		final double PI;
//		final double GRAVITY;
		
		public void displayPerson()
		{
			System.out.println("name " +name);
			System.out.println("age " +age);
			System.out.println("height " +height);
			System.out.println("Are You Maha " +domicileMh);
		}
		
		public Person() //No Args Constructor
		{
			name="Alice";
			age=18;
			height=5.10;
			domicileMh=true;
		}

		public Person(String name, int age, double height, boolean domicile)//All Args Constructor
		{
			this.name=name;
			this.age=age;
			this.height=height;
			this.domicileMh=domicile;
		}
		
		public Person(Person temp)//Copy Constructor
		{
			this.name=temp.name;
			this.age=temp.age;
			this.height=temp.height;
			this.domicileMh=temp.domicileMh;
		}
		
//		public Person(double a,double b) //RequiredArgsConstructor
//		{
//			this.PI=a;
//			this.GRAVITY=b;
//		}
}
