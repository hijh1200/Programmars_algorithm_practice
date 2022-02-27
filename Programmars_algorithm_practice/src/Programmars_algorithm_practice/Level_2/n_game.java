package Programmars_algorithm_practice.Level_2;

public class n_game {
	public static String[] str = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
    public static String calc(int n, int num) {
        if(num == 0) return "0";
        String res = "";
        while(num != 0) { 
            res = str[num%n] + res;
            num /= n;
        }
        return res;
    }
    public static String solution(int n, int t, int m, int p) {
        String s = "";
        int num = 0;
        while(s.length() <= t*m) { s += calc(n, num++); }
        
        String res = "";
        int i = 0;
        while(res.length() != t) { res += s.charAt(m * (i++) + p - 1); }
        return res;
    }
	public static void main(String[] args) {
		System.out.println(solution(2, 4, 2, 1));
	}

}
