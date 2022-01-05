package Programmars_algorithm_practice.Level_2;

import java.util.Arrays;

public class phone_number_list {
	public static boolean solution(String[] phone_book) {
		Arrays.sort(phone_book);
		for(int i=0; i<phone_book.length-1; i++) {
			for(int j=i+1; j<phone_book.length; j++) {
				if(phone_book[i].length() <= phone_book[j].length()) {
					if(phone_book[i].equals(phone_book[j].substring(0, phone_book[i].length()))) {
						return false;
					}
				}
				
			}
		}
		return true;
	}
	public static void main(String[] args) {
		String[] phone_book = {"119", "97674223", "1195524421"};
		System.out.println(solution(phone_book));
	}

}
