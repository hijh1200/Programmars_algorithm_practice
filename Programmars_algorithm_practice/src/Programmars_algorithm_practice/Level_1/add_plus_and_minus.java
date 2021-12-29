package Programmars_algorithm_practice.Level_1;

public class add_plus_and_minus {
	public static int solution(int[] absolutes, boolean[] signs) {
		int plus = 0;
		int minus = 0;
		for(int i=0; i<absolutes.length; i++) {
			if(signs[i] == true) {
				plus += absolutes[i];
			}else {
				minus += absolutes[i];
			}
		}
        return plus - minus;
    }
	public static void main(String[] args) {
		
		int[] absolutes = {4,7,12};
		boolean[] signs = {true,false,true};
		System.out.println(solution(absolutes, signs));

	}

}
