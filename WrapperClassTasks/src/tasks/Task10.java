package tasks;

import java.util.Arrays;

public class Task10 {

	
		// TODO Auto-generated method stub
		public static void main(String[] args) { 
			Integer[] nums = {20, 10, 40, 30, 50}; 
			Arrays.sort(nums); // sort ascending 
			System.out.println("Sorted: " + Arrays.toString(nums)); 
			System.out.println("2nd highest: " + nums[nums.length - 2]); 

	}
}

