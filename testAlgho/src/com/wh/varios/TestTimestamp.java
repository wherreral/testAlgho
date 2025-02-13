package test;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class TestTimestamp {

	
	public static Date addHoursToJavaUtilDate(Date date, int hours) {
	    Calendar calendar = Calendar.getInstance();
	    calendar.setTime(date);
	    calendar.add(Calendar.HOUR_OF_DAY, hours);
	    return calendar.getTime();
	}
	
	public static long getDateDiff(Date date1, Date date2, TimeUnit timeUnit) {
	    long diffInMillies = date2.getTime() - date1.getTime();
	    return Math.abs(timeUnit.convert(diffInMillies,TimeUnit.MILLISECONDS));
	}
	

	
	
	public static void main(String[] args) {
		
		
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date;
		try 
		{
			SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
			try {
				Date dateTime = sf.parse("21-08-2023 09:34:23");
			    System.out.println("dateTime:"+dateTime);
			    
			    Date dateTimePlusHours = addHoursToJavaUtilDate(dateTime,1);
			    System.out.println("dateTimePlusHours:"+dateTimePlusHours);
			    
			    
			    Date currentDate = new Date();
			    System.out.println("currentDate:"+currentDate);
			    
			    
			    long ll = getDateDiff(currentDate,dateTime,TimeUnit.HOURS);
			    System.out.println("ll:"+ll);
			    
			 // if currentDate is after dateOne
		        System.out.println(currentDate.after(dateTimePlusHours));
			    
		        long Time_difference  = currentDate.getTime() - dateTimePlusHours.getTime();
		        
		        long Hours_difference  = (Time_difference  / (1000 * 60 * 60))  % 24;
		        
		        System.out.println("Hours_difference:"+Hours_difference);
		        
		        long Days_difference  = (Time_difference  / (1000 * 60 * 60 * 24))  % 365;
		        
		        System.out.println("Days_difference:"+Days_difference);
			    
			} catch (ParseException e) {
			    e.printStackTrace();
			}
			
			
			
			date = dateFormat.parse("16/08/2023");
			long time = date.getTime();
			Timestamp ts1 = new Timestamp(time);
			System.out.println("ts1:"+ts1);
			
			
			Timestamp ts11 = stringToTimeStamp("");
			Timestamp timestamp = new Timestamp(new Date().getTime());//current
			
			System.out.println("timestamp:"+timestamp);
			
			System.out.println("campare 1 "+compareTwoTimeStamps(timestamp,ts1));
			System.out.println("campare 2 "+compareTwoTimeStamps2(timestamp,ts1));
			System.out.println("campare 3 "+compareTwoTimeStamps3(timestamp,ts1)+ " horas");
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
	public static long compareTwoTimeStamps3(Timestamp currentTime, Timestamp oldTime) 
	{
	  long milliseconds1 = oldTime.getTime();
	  long milliseconds2 = currentTime.getTime();
	  long diff = milliseconds2 - milliseconds1;
	  long diffMinutes = diff / (60 * 1000);
	  return diffMinutes/60l;
	}
	
	public static long compareTwoTimeStamps(java.sql.Timestamp currentTime, java.sql.Timestamp oldTime) 
	{
	    long min1 = oldTime.getHours() * 60 + oldTime.getMinutes();
	    long min2 = currentTime.getHours() * 60 + currentTime.getMinutes();
	    return min2 - min1;
	}
	
	public static long compareTwoTimeStamps2(java.sql.Timestamp currentTime, java.sql.Timestamp oldTime)
	{
	    final Calendar oldCal = Calendar.getInstance();
	    oldCal.setTime(oldTime);
	    long min1 = oldCal.get(Calendar.HOUR) * 60 + oldCal.get(Calendar.MINUTE);
	    final Calendar currentCal = Calendar.getInstance();
	    currentCal.setTime(currentTime);
	    long min2 = currentCal.get(Calendar.HOUR) * 60 + currentCal.get(Calendar.MINUTE);
	    return min2 - min1;
	}
	
	
	public static Timestamp stringToTimeStamp (String yourString ){

		try {
			
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddhhmmss");
			//20200305143611
			//vlogInfo("RIT Inside method OrderUpdateExpressDeliveryGenerator/stringToTimeStamp - dateFormat:"+dateFormat);
			Date parsedDate = dateFormat.parse(yourString);
			
			Timestamp timestamp = new java.sql.Timestamp(parsedDate.getTime());
			

			//String timestampstring = "20200305143611";
			//Date parsedDate = dateFormat.parse(timestampstring);
			//Timestamp timestamp = new java.sql.Timestamp(parsedDate.getTime());

			return timestamp;
		} catch(Exception e)
		{
			
		}

		return new Timestamp(System.currentTimeMillis());
	}
	
}
