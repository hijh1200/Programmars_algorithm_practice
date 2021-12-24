package Programmars_algorithm_practice.Level_1;
// 없는 숫자 더하기

import java.util.stream.IntStream;
public class add_missing_numbers {
	
	public static int solution(int[] numbers) {
		int answer = 0;
		for(int i=1; i<10; i++) {
			int j = i;
			if(IntStream.of(numbers).anyMatch(x -> x == j) == false) {
				answer += j;
			}
		}	
        return answer;
    }
	
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,6,7,8,0};
		System.out.println(solution(numbers));
	}

}
