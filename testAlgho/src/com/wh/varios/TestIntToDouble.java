package test;

public class TestIntToDouble {
	
	
	public static void main(String[] args) {
	
		Object objInt = 123456;
		
		Double d = 0.0;
		
		//d = (Double )objInt; 
		//d = new Double ((Double) objInt);
		//d = Double.valueOf(objInt);
		
		if (objInt instanceof Integer) {
	        System.out.println("This is an Integer");
	        d = ((Integer) objInt).doubleValue();
	    } else if(objInt instanceof String) {
	        System.out.println("This is a String");
	    } else if(objInt instanceof Double) {
	        System.out.println("This is a Float");
	    }
		
		System.out.println("d:"+d);
		
	}
}
