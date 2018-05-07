package jbas;

public class Casting {

	public static void main(String[] args) {
		
		String age = "100.123456789";
		System.out.println("String: " + age);
		
		// String to Double
		double ageDbl = Double.parseDouble(age);
		System.out.println("String to Double: " + ageDbl);
		
		// Double to Float
		float ageFlt1 = (float) ageDbl;
		System.out.println("Double to Float: " + ageFlt1);
		
		// float ageFlt2 = Float.parseFloat(ageFlt1); // No.
		
		// String to Float
		float ageFlt3 = Float.parseFloat(age);
		System.out.println("String to Float: " + ageFlt3);
		
		// Float to Int
		int ageInt = (int) ageFlt1;
		System.out.println("Float to Int: " + ageInt);
		
		// Int to Float
		float ageIntToFlt = (float) ageInt;
		System.out.println("Int to Float: " + ageIntToFlt);
		
	}

}
