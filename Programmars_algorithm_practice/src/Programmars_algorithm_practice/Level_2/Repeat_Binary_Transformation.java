package Programmars_algorithm_practice.Level_2;

import java.util.Arrays;

public class Repeat_Binary_Transformation {
	public static int[] solution(String s) {
		int[] answer = new int[2];
        
        while(!s.equals("1")) {
            answer[0]++;
            int temp = s.length();
            s = s.replaceAll("0", "");
            answer[1] += temp - s.length();
            s = Integer.toBinaryString(s.length());
        }
        
        return answer;
    }
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution("110010101001")));
	}

}
