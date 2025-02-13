package test;

import java.util.Date;

public class TestDate {

	public static final long HOUR = 3600*1000;
	public static final long MINUTE = 60*1000;
	
	public static void main(String[] args) {
			 
		Date oldD = new Date();
		Date newD = new Date(oldD.getTime() + 1 * HOUR);
		Date newDMin = new Date(oldD.getTime() + 1 * MINUTE);
		
		System.out.println(oldD);
		System.out.println(newD);
		System.out.println(newDMin);
		
		if(newDMin.after(oldD)) {
			System.out.println("newDMin:"+newDMin+" es mayor que newD "+oldD);
			
		}
		
	}
	
	
}
