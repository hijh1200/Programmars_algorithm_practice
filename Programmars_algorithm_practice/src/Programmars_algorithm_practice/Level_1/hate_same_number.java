package Programmars_algorithm_practice.Level_1;

import java.util.ArrayList;

public class hate_same_number {
	public static int[] solution(int[] arr) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(arr[0]);
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i] != arr[i+1]) {
				list.add(arr[i+1]);
			}
		}
		int[] res = new int[list.size()];
		for(int i=0; i<list.size(); i++) {
			res[i] = list.get(i);
		}
		return res;
	}
	public static void main(String[] args) {
		int[] arr = {1,1,3,3,0,1,1};
		System.out.println(solution(arr));
	}

}
