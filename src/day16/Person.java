package day16;

public class Person {
		String name;
		int age;
		double height;
		public boolean domicileMh;
		
		
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

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public double getHeight() {
			return height;
		}

		public void setHeight(double height) {
			this.height = height;
		}

		public boolean isDomicileMh() {
			return domicileMh;
		}

		public void setDomicileMh(boolean domicileMh) {
			this.domicileMh = domicileMh;
		}
		

}
