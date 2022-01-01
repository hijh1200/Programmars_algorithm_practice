package Programmars_algorithm_practice.Level_1;

import java.util.ArrayList;
import java.util.Arrays;
public class ponketmon {
	public static int solution(int[] nums) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Arrays.sort(nums);
		list.add(nums[0]);
		
		for(int i=1; i<nums.length; i++) {
			System.out.println("*");
			if(list.get(list.size()-1) != nums[i]) { 
				list.add(nums[i]);
			}
		}
		
		if(nums.length/2 <= list.size()) return nums.length/2;
		else return list.size();
	}

	public static void main(String[] args) {
		int[] nums = {3,3,3,2,2,4};
		System.out.println(solution(nums));
		
	}

}
