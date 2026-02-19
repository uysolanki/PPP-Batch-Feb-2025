package day9;

public class DriverApp {

	public static void main(String[] args) {
		Tyre tyre1=new Tyre(5.0, "MRF", "Rubber");
		Tyre tyre2=new Tyre(6.0, "Ceat", "CarbonFiber");
		
		Engine engine1=new Engine( 1500, "Toyota", "Petrol");
		Engine engine2=new Engine( 2500, "Tesla", "Electric");
		
		Car car1=new Car("Innova","Toyota","White",200.0, tyre1, engine1);
		Car car2=new Car("Model S","Tesla","Black",300.0,tyre2,engine2);
		Car car3=new Car("Model S","Tesla","Black",300.0,tyre2,engine2);
		Car car4=new Car(car2);
		car4.setCarColor("Red");
		
		
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
		System.out.println(car4);

	}

}
