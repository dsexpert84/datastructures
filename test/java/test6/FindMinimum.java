package test6;

/**
 * Find Minimum in rotated subarray
 * @author asharda
 *
 */
public class FindMinimum {

	/**
	 * Find Min in rotated subarray
	 * @param nums
	 * @return
	 */
	public int findMin(int[] nums) {
		boolean flag=false;

		System.out.println(nums.length);
		if(nums.length==0)
		{
			return 0;
		}
		else if (nums.length==1)
		{
			return nums[0];
		}

		else
		{
			for(int i=1;i<nums.length;i++)
			{
				if(nums[i-1] >nums[i])
				{
					flag=true;
					return nums[i];
					
				}
			}//end of for
			
			if(!flag)
			{
				return nums[0];
			}

		}//end of else
		
		return 0;
	}
	public static void main(String[] args) {

		FindMinimum m=new FindMinimum();
		int nums[]= {1,2};
		System.out.println("Place where array is rotated is "+m.findMin(nums));
	}

}
