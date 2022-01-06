package Programmars_algorithm_practice.Level_2;

import java.util.ArrayList;

public class carpet {
	public static int[] solution(int brown, int yellow) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		
		for(int i=1; i<=Math.sqrt(yellow); i++) {
			if(yellow % i == 0) {
				a.add(i);
				b.add(yellow/i);
			}
		}
		
		int[] res = new int[2];
		for(int i=0; i<a.size(); i++) {
			if(a.get(i) * 2 + b.get(i) * 2 + 4 == brown) {
				res[0] = b.get(i) + 2;
				res[1] = a.get(i) + 2;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		int brown = 10;
		int yellow = 2;
		System.out.println(solution(brown, yellow));
	}

}
