package Programmars_algorithm_practice.Level_1;

public class caesar_cipher {
	public static String solution(String s, int n) {
		String a = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
        String b = "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String res = "";
        
        for(int i=0; i<s.length(); i++) {
        	if(s.charAt(i) == ' ') res = res + s.substring(i, i+1);
        	else if(Character.isLowerCase(s.charAt(i))){
        		res = res + a.substring(a.indexOf(s.charAt(i)) + n, a.indexOf(s.charAt(i)) + n + 1);
        	}
        	else {
        		res = res + b.substring(b.indexOf(s.charAt(i)) + n, b.indexOf(s.charAt(i)) + n + 1);
        	}
        }
        return res;
	}
	public static void main(String[] args) {
		String s = "AB";
		int n = 1;
		System.out.println(solution(s, n));
	}

}
