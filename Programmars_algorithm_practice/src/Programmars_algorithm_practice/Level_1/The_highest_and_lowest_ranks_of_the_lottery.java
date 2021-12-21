
package Programmars_algorithm_practice.Level_1;
import java.util.Arrays;
// 로또의 최고 순위와 최저 순위
public class The_highest_and_lowest_ranks_of_the_lottery {
	public static int[] solution(int[] lottos, int[] win_nums) {
		int count = 0;			// 맞춘 개수
		int zero_count = 0;		// 0 개수
		int a, b = 0;
		int[] answer = new int[2];	// 순위
		
		for(int i=0; i<6; i++) {
			if(lottos[i] == 0) {
				zero_count += 1;
			}
		}
		
		for(int i=0; i<6; i++ ) {
			for(int j=0; j<6; j++) {
				if(lottos[i] == win_nums[j]) {
					count++;
				}
			}
		}
		
		a = 7 - count;
		b = 7 - (count + zero_count);
		
		if(b == 7) b = 6;	// count, zero_count 모두 0일 경우
		answer[0] = b;
		if(a == 7) a = 6;	// count 가 0일 경우
		answer[1] = a;
		return answer;
    }
	
	public static void main(String[] args) {
		int[] lottos = {45, 4, 35, 20, 3, 9};
		int[] win_nums = {20, 9, 3, 45, 4, 35};
		System.out.println(Arrays.toString(solution(lottos, win_nums)));
	}

}
