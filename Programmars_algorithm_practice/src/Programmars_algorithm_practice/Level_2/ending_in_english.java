package Programmars_algorithm_practice.Level_2;

import java.util.ArrayList;
import java.util.Arrays;

public class ending_in_english {
	public static int[] solution(int n, String[] words) {
		int[] answer = new int[2];
		ArrayList<String> list = new ArrayList<>();
		
		list.add(words[0]);
		for(int i=1; i<words.length; i++) {
			if(list.contains(words[i]) 
					|| words[i-1].charAt(words[i-1].length()-1) 
						!= words[i].charAt(0)) {
				answer[0] = i%n+1;
				answer[1] = i/n+1;
				return answer;
			} else {
				list.add(words[i]);
			}
		}
        return answer;
    }
	public static void main(String[] args) {
		String[] words = 
			{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
		System.out.println(Arrays.toString(solution(3, words)));
	}

}
