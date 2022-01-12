package Programmars_algorithm_practice.Level_1;
import java.util.Arrays;

public class create_weird_characters {
	public static String solution(String s) {
		String[] arr = s.split(" ", -1);
		String res = "";
		System.out.println(Arrays.toString(arr));
		for(int i=0; i<arr.length; i++) {
			arr[i] = arr[i].toLowerCase();
			char[] ch = arr[i].toCharArray();
			
			for(int j=0; j<ch.length; j+=2) {
				ch[j] = Character.toUpperCase(ch[j]);
			}
			res = res + new String(ch) + " ";
		}
		return res.substring(0, res.length()-1);
	}
	public static void main(String[] args) {
		String s = "try   hello world";
		System.out.println(solution(s));
	}

}
