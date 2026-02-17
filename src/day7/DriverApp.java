package day7;

public class DriverApp {

	public static void main(String[] args) {
		Person p1=new Person();
		Person p2=new Person("Virat",37,5.11,false);
		Person p3=new Person("Rohit",38,5.10,true);
		p1.displayPerson();
		p2.displayPerson();
		p3.displayPerson();
		
		//Person p4=new Person("Virat",37,5.11,false);
		Person p4=new Person(p2);
	}

}
