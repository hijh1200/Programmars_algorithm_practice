package Programmars_algorithm_practice.Level_2;

public class vowel_dictionary {
	public static int solution(String word) {
		int[] index = {781, 156, 31, 6, 1};
		String vowel = "AEIOU";
		int cnt = 0;
		for(int i=0; i<word.length(); i++) {
			 cnt += index[i] * vowel.indexOf(word.charAt(i)) + 1;
		}
        return cnt;
    }
	public static void main(String[] args) {
		System.out.println(solution("EIO"));
	}

}
