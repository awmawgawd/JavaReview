package jbas;

public class Rounding {

	public static void main(String[] args) {


		float ageFloat = 100.123456789f;
		System.out.println("Float: " + ageFloat);
		
		int rounded = Math.round(ageFloat);
		System.out.println("Math.round: " + rounded);

		double roundedDown = Math.floor(ageFloat);
		System.out.println("Rounded Down: " + roundedDown);
		
		double roundedUp = Math.ceil(ageFloat);
		System.out.println("Rounded Up: " + roundedUp);
		
		
		
	}

}
