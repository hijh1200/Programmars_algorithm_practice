package Programmars_algorithm_practice.Level_2;

import java.util.ArrayList;

public class string_compression {
	public static ArrayList<String> list = new ArrayList<String>();
	public static void splitString(String s, int n) {
		int idx = 0;
		for(int i=0; i<s.length()-n+1; i+=n) {
				list.add(s.substring(i, i+n));
				idx = i;
		}
		if(!s.substring(idx + n, s.length()).equals("")) {
			list.add(s.substring(idx + n, s.length()));
		}
	}
	
	public static String compressString() {
		String res = "";
		int cnt = 1;
		for(int i=0; i<list.size()-1; i++) {
			if(list.get(i).equals(list.get(i+1))) {
				cnt++;
				if(i == list.size()-2) {
					res = res + Integer.toString(cnt) + list.get(i);
				}
			}
			else {
				if(cnt != 1) {
					res = res + Integer.toString(cnt) + list.get(i);
				}
				else {
					res = res + list.get(i);
				}
				cnt = 1;
				
				if(i == list.size()-2) {
					res = res + list.get(i+1);
				}
			}
		}
		
		return res;
	}
	
	public static int solution(String s) {
		int min = s.length();
		String res = "";
		
		for(int i=1; i<=s.length()/2; i++) {
			
			splitString(s, i);System.out.println(list);
			res = compressString();System.out.println(res);
			if(res.length() < min) min = res.length();
			list.clear();
			
		}
		return min;
	}
	public static void main(String[] args) {
		String s = "xababcdcdababcdcd";
		System.out.println(solution(s));
	}

}
