package Programmars_algorithm_practice.Level_1;

public class get_middle_letter {
	 public static String solution(String s) {
		 String res = "";
		 if(s.length() % 2 == 0) {
			 int idx1 = s.length() / 2 - 1;
			 int idx2 = idx1 + 1;
			 res = s.substring(idx1, idx2 + 1);
		 }
		 else {
			 int idx = s.length() / 2;
			 res = s.substring(idx, idx + 1);
		 }
		 return res;
	 }

	public static void main(String[] args) {
		String s = "abcdef";
		System.out.println(solution(s));
	}

}
