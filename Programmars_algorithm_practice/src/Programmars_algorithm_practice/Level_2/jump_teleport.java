package Programmars_algorithm_practice.Level_2;

public class jump_teleport {
    public static int solution(int n) {
    	int k = 0;
        while(n!=0) {
            if(n%2 == 0) n /= 2;
            else {n--; k++;}
        }
        return k;
    }
	public static void main(String[] args) {
		System.out.println(solution(5000));
	}

}
