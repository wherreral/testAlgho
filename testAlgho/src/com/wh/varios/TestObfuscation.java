package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class TestObfuscation {

	
	public static void main(String[] args) {
		
		String nombre = "Williams Herrera";
		String str = obfuscation(nombre);
		System.out.println("str:"+str);
		
	}

	private static String obfuscation(String nombre) {
		
		String[] nombreArray = nombre.split(" ");
		CharSequence cs="";
		String ASTERIX = "*";
		ArrayList<String> offArray = new ArrayList();
				
		for(String str: nombreArray) {
			if(str.length()>3) {
				cs = str.subSequence(0, 2);
				
				for(int i=2;i<str.length()-1;i++) {
					cs = cs + ASTERIX;
				}
				cs = cs + String.valueOf(str.charAt(str.length()-1));
				
				
			}else {
				if(str.length() >=2) {
					cs = str.subSequence(0, 2);
					cs = cs + "*";
				}
			}
			System.out.println(cs.toString());
			offArray.add(cs.toString());
			
		}
		//return offArray;
		String srt = offArray.toString().replaceAll("\\[|\\]|,","");
		return srt;
	}
	
}
