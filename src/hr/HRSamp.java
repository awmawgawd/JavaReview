package hr;

public class HRSamp {

	public static void main(String[] args) {
		/**
		 *  Find if the int is in the array. 
		 */
		int[] arr = {3,2,3,1,5};
		int k = 0;
		HRSamp hr = new HRSamp();
		System.out.println("Is number in array: " + hr.findNumber(arr, k));
		
		/**
		 * Find the odd values in array with range from 3 to 9
		 */
		int l = 3;
		int r = 9;
		int[] results =  hr.oddNumbers(l, r);
		System.out.println("Results Array:");
		for(int i = 0; i < results.length; i++) {
			System.out.println(results[i]);
		}
		
		
			
	}
	
	/**
	 * 
	 * @param arr
	 * @param k
	 * @return Returns a String "YES" or "NO"
	 */
	public String findNumber(int[] arr, int k) {
		boolean a = false;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == k) {
				a = true;
				break;
			}
		}
		if(a == true) {
			return "YES";
		}
		else {
			return "NO";
		}
	}
	
	public int[] oddNumbers(int left, int right) {
		
		// Inititalize array size for second array.
		int size = 0;
		
		/* Create array with range from left to right (from 3 to 9). */
		int[] arr2 = new int[right-left+1];
		//System.out.println(arr2.length);
		
		arr2[arr2.length-1] = right;
		
		System.out.println("Create array with range from left to right (from 3 to 9). ");
		
		for(int i = 0; i < arr2.length; i++) {
						
			if(i == 0) {
				arr2[0] = left;
				
			}
			else {
				arr2[i] = ++left;
			}

			/* Find total number of elements that are odd. 4 total: 3,5,7,9 */
			if(arr2[i] % 2 != 0) {
				size++;
			}
		}
		
		/* Print array */
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		
		
		/* Create an array of only the odd numbers from first array */
		System.out.println("Create an array of only the odd numbers from first array ");
		
		int[] arr3 = new int[size];
		//System.out.format("arr3.length: %d", arr3.length);
		
		int begin = 0;
		
		for(int i = 0; i < arr2.length; i++) {
			
			if(arr2[i] %2 != 0) {
				//System.out.println(arr2[i]);
				arr3[begin] = arr2[i];
				//System.out.println(arr3[begin]);
				begin++;
				
			}
		}
		
		
		// Print array
		for(int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		
		System.out.format("Size: %s%n", size);
		
		// Return the array 
		return arr3;
	}
	
	
}
		
