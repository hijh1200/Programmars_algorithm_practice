package Programmars_algorithm_practice.Level_1;

public class String_handling_basics {
	public static boolean solution(String s) {
		if(s.length() ==6 || s.length() == 4) {
			boolean res = true;
			for(int i=0; i<s.length(); i++) {
				if(Character.isLetter(s.charAt(i))) {
					res = false;
					break;
				};
			}
			return res;
		}
		return false;
	}
	public static void main(String[] args) {
		String s = "1e22";
		System.out.println(solution(s));
	}

}
