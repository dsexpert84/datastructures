package src.test.java.examples;

/**
 * @author asharda
 *
 */
public class SearchInsert {

	 public int searchInsert(int[] nums, int target) {
	    
		 if(nums.length==1)
		 {
			if(target >nums[0])
			{
				return 1;
			}
			else
			{
				return 0;
			}
		 }
		 int low=0;
		 int high=nums.length;
		 int mid=(low+high)/2;
		
		 if(target >=nums[mid])
		 {int i=0;
			 for(i=mid;i<=high-1;i++)
			 {
				 if(target==nums[i])
				 {
					 return i;
				 }
				 else if(target > nums[i] )
				 {
					  i++;
				 }
				 else if(target > nums[i] && target <nums[i+1])
				 {
					  i++;
				 }//end of else
			 }//end of for
				 
			 return i;
		 }//end of if
		 
		 else if (target <=nums[mid])
		 {
			 int i=0;
			 for(i=low;i<mid;i++)
			 {
				 if(target==nums[i])
				 {
					 return i;
				 }
				 else if(target < nums[0] )
				 {
					 return i;
				 }
				 
				 else if(target > nums[i] && target <nums[i+1])
				 {
					i++;
				 }//end of else
				 else if(target > nums[i] )
				 {
					  i++;
				 }
				 
			 }
			 
			 return i;
		 }//end of else
		 
		 return 0;
	    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int nums[]= {1,3,5,6};
		SearchInsert s=new SearchInsert();
		System.out.println(s.searchInsert(nums, 2));
	}

}
