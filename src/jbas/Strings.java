package jbas;

public class Strings {

	public static void main(String[] args) {
		
		// String is immutable.
		// Cannot be changed, so a new String object is created each time,
			// and the object is assigned to the reference variable.
		
		
		
		String message = "";
		int i = 0;
		
		// String methods
		
		// length() -> Find length of String
		i++; //1
		String name = "Jacqueline";
		message += i + ")\t" + name.length() + "\n"; // 10
		
		
		// charAt() -> Find the character at given index
		i++; //2
		message += i + ")\t" + name.charAt(0) + "\n"; // J
		i++; //3
		message += i + ")\t" + name.charAt(1) + "\n"; // a
		i++; //4
		message += i + ")\t" + name.charAt(9) + "\n"; // e
		
		// substring() -> Returns characters
		i++; //5
		message += i + ")\t" + name.substring(1) + "\n"; // acqueline
		i++; //6
		message += i + ")\t" + name.substring(1, 2) + "\n"; // a // takes characters starting at index 1 and before index 2 begins.
		i++;
		message += i + ")\t" + name.substring(1, 3) + "\n"; // ac // takes characters starting at index 1 and before index 3 begins.
		
		
		// toUpperCase() and toLowerCase()
		i++;
		message += i + ")\t" + name.substring(3).toUpperCase() + "\n"; // QUELINE //Capitalizes all letters starting from index 3 // QUELINE
		
		i++;
		message += i + ")\t" + name.substring(9,10).toLowerCase() + "\n"; // e // No 10th index, but there is "end of string" protection.
		
		//Alternatively:
		i++;
		message += i + ")\t" + name.substring(9).toLowerCase() + "\n"; 
		
		
		// equals() and equalsIngoreCase()
		i++;
		message += i + ")\t" + name.equals("Jacqueline") + "\n"; // true
		i++;
		message += i + ")\t" + name.equals("jacqueline") + "\n"; // false
		i++;
		message += i + ")\t" + name.equals("JACQUELINE") + "\n"; // false
		
		i++;
		message += i + ")\t" + name.equalsIgnoreCase("Jacqueline") + "\n"; // true
		i++;
		message += i + ")\t" + name.equalsIgnoreCase("jacqueline") + "\n"; // true
		i++;
		message += i + ")\t" + name.equalsIgnoreCase("JACQUELINE") + "\n"; // true
		
		
		// startsWith() and endsWith()
		i++;
		message += i + ")\t" + name.startsWith("J") + "\n"; // true
		i++;
		message += i + ")\t" + name.startsWith("j") + "\n"; // false -> case matters
		i++;
		message += i + ")\t" + name.endsWith("e") + "\n"; // true
		i++;
		message += i + ")\t" + name.endsWith("E") + "\n"; // false -> case matters
				
		
		// contains()
		i++;
		message += i + ")\t" + name.contains("c") + "\n"; // true
		// Alternatively: does index where "c" is located not -1. Is it found?
		i++;
		message += i + ")\t" + (name.indexOf("c") != -1) + "\n"; // true
		
		
		
		// replace()
		i++;
		message += i + ")\t" + name.replace('a', 'A') + "\n"; // JAcqueline
		i++;
		message += i + ")\t" + name.replace("a", "A") + "\n"; // JAcqueline
		
		
		// trim() -> removes whitespace fromb eginning and end of a string. Remove \t, \n, \r, any space.
		i++;
		message += i + ")\t" + name.trim() + "\n"; // Jacqueline
		i++;
		message += i + ")\t" + ("\n Jacqueline\n").trim() + "\n"; // Jacqeline
		
		
		// Method Chaining
		i++;
		message += i + ")\t" + name.trim().toLowerCase().replace('a', 'A') + "\n"; // Jacqueline -> jacqueline -> jAcqueline
		i++;
		message += i + ")\t" + name.trim().toLowerCase().replace('a', 'A').substring(3) + "\n"; // Jacqueline -> jacqueline -> jAcqueline -> queline
		i++;
		message += i + ")\t" + name.trim().toLowerCase().replace('a', 'A').substring(1) + "\n"; // Jacqueline -> jacqueline -> jAcqueline -> Acqueline
		
		// String is Immutable (cannot change)
		String example = name.toUpperCase();
		i++;
		message += i + ")\t" + example + "\n"; // JACQUELINE // example references new object "JACQUELINE"
		i++;
		message += i + ")\t" + name + "\n"; // name is still unchanged. 
			// we would need to say name = name.toUpperCase() for name to not reference object "Jacqueline" and instead reference object "JACQUELINE"
		
		
		// 27 objects total created. 26 objects available for garbage collection.
			// The last string object that contains "abcdefghijklmnopqrstuvwxyz" will still be in use.
		String alpha = ""; // New string object with "" value is initialized to reference variable alpha
		
		// This will create 26 new string objects.
			// Ex: 1) a 2) ab 3) abc 4)abc ....etc. 26)abcdefghijklmnopqrstuvwxyz
		for(char current = 'a'; current <= 'z'; current++) {
			alpha += current;
		}
		i++;
		message += i + ")\t" + alpha + "\n";
		
		
		String ah = "hello";
		String ba = new String("hello");
		
		/* Compare String liter and String object */
		i++;
		message += i + ")\t" + String.format("%b%n", ah == ba); // false -> ah and ba point to 2 different objects
		i++;
		message+= i + ")\t" + String.format("%b%n", ah.equals(ba)); // true -> The values of ah and ba are the same.
		
		
		/* Compare Integer vs int */
		Integer yo  = 1;
		int yi = 1;
		
		i++;
		message += i + ")\t" + String.format("%b%n", yo == yi); // true. -> yo is auto unboxed to an int.
		i++;
		message += i + ")\t" + String.format("%b%n", yo.equals(yi)); // true -> Values of yo and yi are the same.
		
		
		
		
		
		System.out.println(message);
	}

}
