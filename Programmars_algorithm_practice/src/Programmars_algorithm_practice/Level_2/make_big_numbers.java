package Programmars_algorithm_practice.Level_2;

public class make_big_numbers {
	public static String solution(String number, int k) {
		StringBuilder sb = new StringBuilder();
		int l = number.length() - k; // 10 - 4 = 6
        int left = 0;
        int right = 0;
        int max = -1;
        
        while(true) {
        	if(sb.length() == number.length() - k) break;
        	
        	max = -1;
        	right = (number.length()-1) - (l-1);
        	for(int i=left; i<=right; i++) {
        		if(max < number.charAt(i) - '0') {
        			max = number.charAt(i) - '0';
        			left = i+1;
        		}
        	}
        	l--;
        	sb.append(max+"");
        }
		return sb.toString();
    }
	
	public static void main(String[] args) {
		System.out.println(solution("4177252841", 4));
	}

}
