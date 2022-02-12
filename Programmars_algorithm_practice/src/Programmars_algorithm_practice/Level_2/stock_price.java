package Programmars_algorithm_practice.Level_2;

import java.util.Arrays;
public class stock_price {
	public static int[] solution(int[] prices) {
	        int[] answer = new int[prices.length];
	        for(int i=0; i<prices.length-1; i++) {
	        	for(int j=i+1; j<prices.length; j++) {
	        		answer[i] += 1;
	        		if(prices[i] > prices[j]) break;
	        	}
	        }
	        return answer;
	    }
	public static void main(String[] args) {
		int[] prices = {1, 2, 3, 2, 3};
		System.out.println(Arrays.toString(solution(prices)));
	}

}
