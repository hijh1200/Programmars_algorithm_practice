package Programmars_algorithm_practice.Level_2;

import java.util.Arrays;
public class H_index {
	public static int solution(int[] citations) {
		int h = 0;
		Arrays.sort(citations);
		int[] temp = new int[citations.length];
		for(int i=0; i<citations.length; i++) temp[citations.length-1 - i] = citations[i];
		
		for(int i=0; i<temp.length; i++) {
			if(i+1 <= temp[i]) {
				h = i+1;
			}
		}
		
		System.out.println(Arrays.toString(temp));
        return h;
	}

	public static void main(String[] args) {
//		int[] citations = {1,4,4,4,9,9,9,9,9};
		int[] citations = {1,2,3,4,5,6,7};
//		int[] citations = {3, 0, 6, 1, 5};
//		int[] citations = {3, 0, 6, 1, 5};
//		int[] citations = {3, 0, 6, 1, 5};
		System.out.println(solution(citations));
	}

}
