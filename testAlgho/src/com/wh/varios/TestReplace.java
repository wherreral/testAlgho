package test;

public class TestReplace {

	public static void main(String[] args) {
		
		String test = "{A+ÁñÑÚeeéÉiÍÓÚuuuííÚ";	
		System.out.println("test:"+test);
		System.out.println("test:"+replaceAccents(test).toUpperCase());
		
		
	}
	
	static String replaceAccents(String cadena) {
        return cadena.replace("Á", "A")
                .replace("É", "E")
                .replace("Í", "I")
                .replace("Ó", "O")
                .replace("Ú", "U")
                .replace("Ñ", "N")
                .replace("á", "a")
                .replace("ñ", "n")
                .replace("é", "e")
                .replace("í", "i")
                .replace("ó", "o")
                .replace("ú", "u");
    }
	
}
