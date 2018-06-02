
package sort;

/**
 * Insertion Sort
 * @author asharda
 *
 */
public class InsertionSort {

	/**
	 * Sort Function
	 * @param nums
	 * @return
	 * @throws Exception
	 */
	public int [] sort(int []nums) throws Exception
	{
		int temp;
		if(nums.length <1)
		{
			throw new Exception();
		}

		for(int i=0;i<nums.length;i++)
		{
			//key=nums[i];
			for(int j=i+1;j<nums.length;j++)
			{
				if(nums[i]>nums[j])
				{
					temp=nums[j];
					nums[j]=nums[i];
					nums[i]=temp;
				}
			}
		}//end of i
		return nums;
	}
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {

		InsertionSort sort=new InsertionSort();
		int nums[]= {5,2,1,3,6,4};
		sort.sort(nums);
		for(int i:nums)
		{
			System.out.println(i);
		}

	}

}
