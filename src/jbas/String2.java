package jbas;

public class String2 {

	public static void main(String[] args) {
		
		// StringBuilder is mutable.
		// It can be changed.
		// New objects will not be created for each assignment.
		
		StringBuilder alpha = new StringBuilder();
		String message = "";
		
		/* Use StringBuilder to print alphabet letters */
		for(char current = 'a'; current <= 'z'; current++) {
			alpha.append(current);
		}
		
		message += alpha + "\n";
		// Alternative: Using String.format to include new-line
		message += String.format("%s%n", alpha);
		
		
		/* StringBuilder mutability and chaining */
		StringBuilder sb = new StringBuilder("start");
		sb.append("+middle"); 
			// sb = sb + "+middle"; ---> sb = "smart+middle";
			//sb.append references its self and and then adds the new text
		message += "sb: " + sb + "\n";
		
		StringBuilder same = sb.append("+end"); 
			//same = (sb = sb + "+end"); 
			// ---> same = (sb = "smart+middle" + "+end"); 
			// ---> same = (sb = "smart+middle+end");
			// same = "smart+middle+end"; 
			// sb = "smart+middle+end";
		
			// same and sb both point to the same object.
		
		
		message += "same: " + same + "\n";
		message += "sb: " + sb + "\n";
		
		
		/* Example of assigning multiple variables to same value */
		int a = 1;
		int b = (a = 2);
		message += ("a: " + a + " b: " + b + "\n");
		// Alternative:
		message += String.format("a: %s b: %s %n", a, b);
		
		
		
		
		/* Only one StringBuilder object in this example, since only one new() keyword is used */
		StringBuilder letters  = new StringBuilder("abc");
		message += String.format("letters: %s%n", letters); // Output letters // abc
		
		StringBuilder more = letters.append("de");
		message += String.format("more: %s%n", more); // Output more // abcde
		
		message += String.format("letters: %s%n", letters); // Output letters //abcde
		
		message += (letters == more) + "\n";
		
		
		
		/* Check equality */
		StringBuilder one = new StringBuilder("hi");
		StringBuilder two = new StringBuilder("hi");
		
		message += "one == two: " + (one == two) + "\n"; // False // Compares reference and not value
		message += "one.equals(two): " + one.equals(two) + "\n"; // False // Compares reference and not value
		/* Convert to String format using toString() method and compare*/
		message += "one.toString().equals(two.toString(): " + one.toString().equals(two.toString()) + "\n"; // True // Values are the same
		
		/* Alternative: Convert to String format using toString() method and compare*/
		String oneS = one.toString();
		String twoS = two.toString();
		message += "oneS = one.toString\n";
		message += "twoS = two.toString()\n";
		message += "oneS == twoS: " + (oneS == twoS) + "\n"; // False // 2 different String objects 
		message += "oneS.equals(twoS): " + oneS.equals(twoS) + "\n"; // True // Values are the same
		
		
		
		
		
		
		
		
		
		
		
		System.out.println(message);
	}

}
