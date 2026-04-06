package day3;

public interface Turf {
	
	double getTurfPrice();
	String getTurfName();
	
	public default String getCompanayName() {
		return "Velocity";
	}
	
	public static String getwebSiteName() {
		return "www.velocity.com";
	}
	
	public default String default1() {
		return "Velocity";
	}
	
	public default String default2() {
		return "www.velocity.com";
	}
	
	public static String static1() {
		return "www.velocity.com";
	}
	
	public static String static2() {
		return "www.velocity.com";
	}
}
