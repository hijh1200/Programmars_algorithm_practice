package Programmars_algorithm_practice.Level_2;

public class next_big_number {
	public static int solution(int n) {
        String s = Integer.toBinaryString(n);
        int cnt = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '1') cnt++;
        }
        
        for(int i=n+1; i<1000000; i++) {
            String temp = Integer.toBinaryString(i);
            int tempCnt = 0;
            for(int j=0; j<temp.length(); j++) {
                if(temp.charAt(j) == '1') tempCnt++;
            }
            if(tempCnt == cnt) return i;
        }
        return 0;
    }
	public static void main(String[] args) {
		System.out.println(solution(78));
	}

}
