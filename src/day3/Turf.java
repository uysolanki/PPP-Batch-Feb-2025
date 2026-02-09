package day3;

public interface Turf {
	
	double getTurfPrice();
	String getTurfName();
	
	default String getCompanyName()
	{
		return "ABC Turf Company";
	}
}
