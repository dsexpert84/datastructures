package src.test.java.examples;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Remove Duplicates from Sorted Array
 * 
 * @author asharda
 *
 */
public class RemoveDuplicates {

	static int [] nums1;
	public int removeDuplicates(int[] nums) {

		  if(nums == null || nums.length ==0)
	            return 0;
	        int index = 0;
	        for(int i=1; i<nums.length; i++){
	            if(nums[index] != nums[i]){
	                index++;
	                nums[index] = nums[i];
	            }
	        }
	        for(int i:nums)
	        {
	        	System.out.println("num seen is "+i);
	        }
	        return index+1;
	    }	

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		RemoveDuplicates rd = new RemoveDuplicates();
		int nums[] = { 1,1,2 };
		
		System.out.println(rd.removeDuplicates(nums));
		//nums=nums1;
//		for(int i:nums)
//		{
//			System.out.println("num seen is "+i);
//		}
		//System.out.println(rd.removeDuplicates(nums));
	}

}
