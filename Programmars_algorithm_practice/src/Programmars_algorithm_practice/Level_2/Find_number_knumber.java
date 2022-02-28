package Programmars_algorithm_practice.Level_2;

public class Find_number_knumber {
	public static boolean isPrime(long n) {
        if(n==0 || n==1) return false;
        if(n==2 || n==3) return true;
        for(int i=2; i<=Math.sqrt(n); i++) if(n%i == 0) return false;
        return true;
    }
    public static int solution(int n, int k) {
        String s = "";
        while(n>0) {
            s = n%k + s;
            n/=k;
        }
        
        int cnt = 0;
        String temp = "";
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) != '0') temp += s.charAt(i);
            else {
                if(isPrime(Long.parseLong(temp))) cnt++;
                temp = "0";
            }
        }
        if(!temp.equals("0")) if(isPrime(Long.parseLong(temp))) cnt++;
        return cnt;
    }
	public static void main(String[] args) {
		System.out.println(solution(437674, 3));
	}

}
