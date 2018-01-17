/*Given a sorted array, 
 * remove the duplicates in-place such that 
 * each element appear only once and 
 * return the new length.
 * Do not allocate extra space for another array, 
 * you must do this by modifying the input array in-place 
 * with O(1) extra memory.
Example:
Given nums = [1,1,2],
Your function should return length = 2, 
with the first two elements of nums being 1 and 2 respectively.
It doesn't matter what you leave beyond the new length.*/

public class RemoveDuplicatesInASortedArray {
	public static void print(int[] nums)
	{
		for (int i = 0; i < nums.length; ++i)
			System.out.println(nums[i]);
	}
	 public static int removeDuplicates(int[] nums) {
		int length = nums.length;
		if (length == 0 || length == 1)
			return length;
		int new_length = 1;
		for (int i = 1; i < length; ++i)
		{
			print(nums);
			System.out.println("i = " + i);
			if(nums[i] != nums[i-1])
			{
				System.out.println("nums[i] ("+nums[i]+") !=nums[i-1] ("+nums[i-1]+")");
				nums[new_length] = nums[i]; 
				new_length++; 
				System.out.println("new_length = " + new_length);
			}
		}
		System.out.println("final massiv:");
		print(nums);
		return new_length;	        
	    }
	 public static void main(String[] args)
	 {
		 int[] nums = {1,1,2,3,3,4};
		 System.out.println("answer = " + removeDuplicates(nums));
	 }
}
