package Programmars_algorithm_practice.Level_2;

import java.util.Arrays;

public class Truncate_n2_Array {
	public static int[] solution(int n, long left, long right) {
		int[] answer = new int[(int)(right - left + 1)];
        
        int idx = 0;
        for(long i=left; i<=right; i++) {
            answer[idx++] = (int)Math.max(i/(long)n, i%(long)n) + 1;
        }
        
        return answer;
    }
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(3,2,5)));
	}

}
