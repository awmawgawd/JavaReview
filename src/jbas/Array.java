package jbas;

public class Array {

	public static void main(String[] args) {

		int[] nums = new int[3];
		
		System.out.println(nums); // Returns memory address
		System.out.println(nums[0]); // Returns first element, which is 0.
		
		nums[0] = 1;
		System.out.println(nums[0]); // Returns first element, which is 1.
		
		nums[1] = 3;
		System.out.println(nums[1]); // Returns second element, which is 3.
		
		nums[2] = 5;
		System.out.println(nums[2]); // Returns third element, which is 5.
		
		String[] names = {"Annie", "Bert", "Christine", "Doug"};
		
		System.out.println("names length: " + names.length);
		
		for(int i = 0; i < names.length; i++) {
			System.out.println("\n" + names[i]);
		}
		
		
	}

}
