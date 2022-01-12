package Programmars_algorithm_practice.Level_1;

public class Find_Kim_Seobang_in_Seoul {
	public static String solution(String[] seoul) {
		String x = "";
		
		for(int i=0; i<seoul.length; i++) {
			if(seoul[i].equals("Kim")) x = x + Integer.toString(i);
		}
		
		String res = "김서방은 " + x + "에 있다";
		return res;
	}
	public static void main(String[] args) {
		String[] seoul = {"Jane", "Kim"};
		System.out.println(solution(seoul));
	}

}
