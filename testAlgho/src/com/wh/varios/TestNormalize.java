package test;

import java.text.Normalizer;
import java.text.Normalizer.Form;

public class TestNormalize {

	public static void main(String[] args) {
		
		String word = "Maipú á ánté";
		
		String normWord = Normalizer.normalize(word, Form.NFD);
		
		String finalWord = normWord.replaceAll("\\p{M}", "");
		
		System.out.println("finalWord:"+finalWord);
		
	}
	
}
