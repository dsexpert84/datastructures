package test5;

import java.util.HashMap;

public class RotatedSortedArray {

	public int search(int[] nums, int target) {

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			hm.put(nums[i], i);
		}
		if (hm.get(target) != null) {
			return hm.get(target);
		}

		return -1;
	}

	public static void main(String[] args) {

		RotatedSortedArray r = new RotatedSortedArray();
		int nums[] = { 4, 5, 6, 7, 0, 1, 2 };
		System.out.println(r.search(nums, 3));
	}

}
