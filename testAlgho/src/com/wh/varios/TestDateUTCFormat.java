package test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class TestDateUTCFormat {

	public static void main(String[] args) {
		
		String fecha2 = "22/10/2024 | 12:00 a 21:30 hrs";
		
		
		System.out.println("fecha2 "+fecha2.split("|")[0]);
		
		//Date oldD = new Date();
		
		//System.out.println(oldD);
		
		
		
		//LocalDate dates = LocalDate.parse(oldstring, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		//System.out.println(dates.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
		
		
		
		//System.out.println(ldt.format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SS'Z'")));
		//System.out.println(ldt.format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SS'Z'")).toString());
		
		String initialHour = "T08:00:00Z";
		
		String oldstring = "22/10/2024 ";
		LocalDateTime ldt = LocalDateTime.of(LocalDate.parse(oldstring.trim(), DateTimeFormatter.ofPattern("dd/MM/yyyy")), LocalTime.of(0,0));
		String fecha = ldt.format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SS'Z'")).toString();
		System.out.println(fecha);
		
		
		
		
		
	}
}
