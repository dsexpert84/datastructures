
package test6;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Longest Consecutive Sequence
 * @author asharda
 *
 */
public class LongestConsecutive {

	LinkedList<Integer> list=new LinkedList<Integer>(); 
	public int longestConsecutive(int[] nums) {

		Arrays.sort(nums);
		if(nums.length<0)
		{
			return -1;
		}
		if(nums.length ==1)
		{
			list.add(nums[0]);
		}
		else
		{
			for(int i=0;i<nums.length;i++)
			{
				if(i==0 && (nums[i+1]==nums[i]+1))
				{
					list.add(nums[i]);
				}

				else if ((i!=0 && nums[i]==nums[i-1]+1) || (i!=0 && nums[i]==nums[i-1]))
				{
					list.add(nums[i]);
				}
			}//end of for

		}
		return list.size();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {


		int nums[]= {0,0,-1};
		LongestConsecutive l=new LongestConsecutive();
		System.out.println(l.longestConsecutive(nums));
	}

}
