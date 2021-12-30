package Programmars_algorithm_practice.Level_1;

import java.util.Arrays;

public class Athletes_who_did_not_finish {
	public static String solution(String[] participant, String[] completion) {
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		for(int i=0; i<participant.length-1; i++) {
			if(participant[i].equals(completion[i]) == false) {
				return participant[i];
			}
		}
		return participant[participant.length-1];
	}

	public static void main(String[] args) {
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		System.out.println(solution(participant, completion));
	}

}
