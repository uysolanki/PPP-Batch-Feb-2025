package day41;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		LocalDateTime dateTime=LocalDateTime.now();
		System.out.println(dateTime);
		
		
		LocalDate republicDay=LocalDate.of(2026, 1, 26);
		System.out.println(republicDay);
		
		LocalTime thisTime=LocalTime.of(9,48,45);
		System.out.println(thisTime);
		
		LocalDate vacationDate=date.plusMonths(2);
		System.out.println(vacationDate);
		
		LocalDate historyDate=date.minusYears(30);
		System.out.println(historyDate);
		
		/*
		 Example formats:
		"dd-MM-yyyy"
		"yyyy/MM/dd"
		"dd MMM yyyy"
		"EEEE, dd MMMM yyyy"
		 */
		//String formatted = date.format(DateTimeFormatter.ofPattern("dd MMM yyyy"));
		//String formatted = date.format(DateTimeFormatter.ofPattern("yyyy MMM dd"));
		String formatted = date.format(DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy"));
		System.out.println(formatted);
		
		String s = "14/11/2025";
		LocalDate date1 = LocalDate.parse(s, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println(date1);
		
		String formatted1 = date1.format(DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy"));
		System.out.println(formatted1);
		
		LocalDate start = LocalDate.of(2020, 1, 1);
		LocalDate end =   LocalDate.of(2025, 1, 1);
		
		Period p=Period.between(start, end);
		System.out.println("GAP in Years" + p.getYears());
		System.out.println("GAP in Months" + p.getMonths());
		System.out.println("GAP in Days" + p.getDays());
		
		
		LocalTime start1 = LocalTime.of(19, 30, 00);
		LocalTime end1 = LocalTime.of(23, 00, 00);
		
		Duration d=Duration.between(start1, end1);
		
		System.out.println("GAP in Hours" + d.toHours());
		System.out.println("GAP in Minutes" + d.toMinutes());
		System.out.println("GAP in Seconds" + d.toSeconds());
		
		
		LocalDate netflixRecharge = LocalDate.now();
		LocalDate netflixExpiryDate = netflixRecharge.plusYears(1);
		
		
		LocalDate randomDate = LocalDate.of(2027, 5, 14);
		if(netflixExpiryDate.isAfter(randomDate))
			System.out.println("Pack Active");
		else
			System.out.println("Pack Expired");

	}

}
