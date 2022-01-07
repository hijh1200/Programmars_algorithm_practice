package Programmars_algorithm_practice.Level_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class decimals {
	static HashSet<Integer> numberSet = new HashSet<Integer>();
	
	public static int solution(String numbers) {
		re("", numbers);
		
		int count = 0; 
		Iterator<Integer> it = numberSet.iterator(); 
		while (it.hasNext()) { 
			int number = it.next(); 
			if (isPrime(number)) count++; 
			}
		
		return count;
	}
	
	public static void re(String comb, String others) {
		if(!comb.equals("")) {
			numberSet.add(Integer.parseInt(comb));
		}
		for(int i=0; i<others.length(); i++) {
			re(comb + others.charAt(i), 
					others.substring(0, i) + others.substring(i+1, others.length()));
		}
	}
	
	public static boolean isPrime(int num) {
		if(num == 2) return false;
		for(int i=2; i<=Math.sqrt(num); i++) {
			if(num % i == 0) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		String numbers = "17";
		System.out.println(solution(numbers));
	}

}
