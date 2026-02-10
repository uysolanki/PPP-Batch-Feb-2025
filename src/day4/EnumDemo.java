package day4;

public class EnumDemo {

	public static void main(String[] args) {
		Weekday today=Weekday.TUESDAY;
		
		System.out.println("Today is "+today);
		
		Planet planet=Planet.JUPITER;
		
		System.out.println("We are living on "+planet);
		System.out.println("Gravity "+planet.calculateGravity());

	}

}
