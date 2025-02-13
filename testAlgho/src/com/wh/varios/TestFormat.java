package test;

import java.text.MessageFormat;
import java.util.Date;

public class TestFormat {

	
	public static void main(String[] args) {
		
		
		int planet = 7;
		 String event = "modContratacion=nuevo";

		 String result = MessageFormat.format(
		     "At {1,time} on {1,date}, there was {2,number,integer} on planet {0,number,integer}.",
		     planet, new Date(), event);
		
		 System.out.println("result"+result);
		
	}
	
}
