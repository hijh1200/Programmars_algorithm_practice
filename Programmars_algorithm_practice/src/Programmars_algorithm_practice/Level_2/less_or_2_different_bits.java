package Programmars_algorithm_practice.Level_2;

import java.util.Arrays;

public class less_or_2_different_bits {

	public static long[] solution(long[] numbers) {
		long[] answer = new long[numbers.length];
		
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i]%2 == 0) {
				answer[i] = numbers[i] + 1;
				continue;
			} else {
				String str = Long.toBinaryString(numbers[i]);
				if(str.indexOf("0") != -1) {
					int zeroIdx = str.lastIndexOf("0");
					int afterIdx = str.indexOf("1", zeroIdx);
					str = str.substring(0, zeroIdx) 
							+ "1" + str.substring(zeroIdx+1, afterIdx) 
							+ "0" + str.substring(afterIdx+1, str.length());
				} else {
					str = "10" + str.substring(1, str.length());
				}
				answer[i] = Long.parseLong(str, 2);
			}
		}
        return answer;
    }
	public static void main(String[] args) {
		long[] numbers = {2,7};
		System.out.println(Arrays.toString(solution(numbers)));
	}

}
