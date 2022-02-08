package Programmars_algorithm_practice.Level_2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class carpet {
	public static int[] solution(int brown, int yellow) {
		Queue<int[]> q = new LinkedList<>();
		for(int i=1; i<=Math.sqrt(yellow); i++) {
			if(yellow%i == 0) {
				q.add(new int[] {yellow/i, i});
			}
		}
		while(!q.isEmpty()) {
			int[] arr = q.poll();
			if(arr[0]*2 + arr[1]*2 + 4 == brown) {
				arr[0] += 2;
				arr[1] += 2;
				return arr;
			}
		}
		int[] res = {};
		return res;
	}
	public static void main(String[] args) {
		int brown = 24;
		int yellow = 24;
		System.out.println(solution(brown, yellow));
	}

}
