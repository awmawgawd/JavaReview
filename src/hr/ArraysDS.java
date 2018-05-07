package hr;


public class ArraysDS {

	/* Reverse an array */
	static int[] reverseArray(int[] a) {
        int[] b = new int[a.length];
        int count = 0;
        
    	for(int i = a.length-1; i >= 0; i--) {
    		//System.out.println(a[i]);
    		b[count++] = a[i];	
    	}
    	
    	
    	
    	return b;
    }
	
	public static void main(String[] args) {
		int[] passIn = {1,3,7,5};
		int[] passOut = reverseArray(passIn);
		
		for(int i = 0; i < passOut.length; i++) {
    		System.out.println(passOut[i]);
    	}
	}
	
	 
      
}

