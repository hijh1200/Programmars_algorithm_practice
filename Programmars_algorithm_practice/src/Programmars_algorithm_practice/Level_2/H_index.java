package Programmars_algorithm_practice.Level_2;

import java.util.Arrays;
public class H_index {
	public static int solution(int[] citations) {
		int answer = 0;
        Arrays.sort(citations);
 
        for (int i = 0; i < citations.length; i++) {
            int h = citations.length - i;
 
            if (citations[i] >= h) {
                answer = h;
                break;
            }
        }
        return answer;
	}

	public static void main(String[] args) {
		int[] citations = {9, 7, 6, 2, 1};
		System.out.println(solution(citations));
	}

}
