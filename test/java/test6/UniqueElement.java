package test6;

import java.util.Arrays;

public class UniqueElement {

	
	public int singleNumber(int []nums)
	{
		
		Arrays.sort(nums);
		if(nums.length<=1)
		{
			return nums[0];
		}
		else
		{
		for(int i=0;i<nums.length;i++)
		{
			if(i>=nums.length-1)
			{
				return nums[i];
				
			}
			if(nums[i]!=nums[i+1])
			{
				return nums[i];
			}
			else
			{
				i++;
			}
		}//end of for
		
		}//end of else
		return 0;
	}
	public static void main(String[] args) {

		UniqueElement q=new UniqueElement();
		int nums[]= {1};
		System.out.println("Single Number found is "+q.singleNumber(nums));
	}

}
