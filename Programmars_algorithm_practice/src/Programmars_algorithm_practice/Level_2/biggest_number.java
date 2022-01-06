package Programmars_algorithm_practice.Level_2;

import java.util.Arrays;
import java.util.Comparator;
public class biggest_number {
	public static String solution(int[] numbers) {
		String[] arr = new String[numbers.length];
		for(int i=0; i<numbers.length; i++) {
			arr[i] = Integer.toString(numbers[i]);
		}
		Arrays.sort(arr, new Comparator<String>() {
			public int compare(String o1, String o2) {
				return (o2 + o1).compareTo(o1 + o2);
			}
		});
		Arrays.sort(arr, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
		String str = "";
		for(int i=0; i<arr.length; i++) {
			str = str + arr[i];
		}
		if(str.charAt(0) == '0') return "0";
		return str;
	}

	public static void main(String[] args) {
		int[] numbers = {6, 10, 2};
		System.out.println(solution(numbers));
	}

}
