package Programmars_algorithm_practice.Level_2;

import java.util.ArrayList;
import java.util.HashMap;
public class news_clustering {
	public static int solution(String str1, String str2) {
		ArrayList<String> str1list = new ArrayList<String>();
		ArrayList<String> str2list = new ArrayList<String>();
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		for(int i=0; i<str1.length()-1; i++) {
			if(Character.isLetter(str1.charAt(i)) && Character.isLetter(str1.charAt(i+1))) {
				str1list.add(str1.substring(i, i+2));
			}
		}
		for(int i=0; i<str2.length()-1; i++) {
			if(Character.isLetter(str2.charAt(i)) && Character.isLetter(str2.charAt(i+1))) {
				str2list.add(str2.substring(i, i+2));
			}
		}
		
		
		
		HashMap<String, Integer> hm1 = new HashMap<String, Integer>();
		HashMap<String, Integer> hm2 = new HashMap<String, Integer>();
		for(int i=0; i<str1list.size(); i++) {
			if(hm1.containsKey(str1list.get(i))) {
				hm1.put(str1list.get(i), hm1.get(str1list.get(i)) + 1);
			}
			else {
				hm1.put(str1list.get(i), 1);
			}
		}
		for(int i=0; i<str2list.size(); i++) {
			if(hm2.containsKey(str2list.get(i))) {
				hm2.put(str2list.get(i), hm2.get(str2list.get(i)) + 1);
			}
			else {
				hm2.put(str2list.get(i), 1);
			}
		}
	
		
		
		HashMap<String, Integer> union = new HashMap<String, Integer>();
		for(String key: hm1.keySet()) {
			union.put(key, hm1.get(key));
		}
		for(String key: hm2.keySet()) {
			if(union.containsKey(key)) {
				union.put(key, Math.max(hm1.get(key).intValue(), hm2.get(key).intValue()));
			}
			else {
				union.put(key, hm2.get(key));
			}
		}
		HashMap<String, Integer> intersection = new HashMap<String, Integer>();
		for(String key: hm1.keySet()) {
			if(hm2.containsKey(key)) {
				intersection.put(key, Math.min(hm1.get(key).intValue(), hm2.get(key).intValue()));
			}
		}
		
		
		
		if(union.size() == 0 && intersection.size() ==0) return 65536;
		int a = 0;
		for(String key: union.keySet()) {
			a += union.get(key);
		}
		int b = 0;
		for(String key: intersection.keySet()) {
			b += intersection.get(key);
		}
		double res = (double)b / a;
		return (int) (res * 65536);
	}
	public static void main(String[] args) {
		String str1 = "E=M*C^2";
		String str2 = "e=m*c^2";
		System.out.println(solution(str1,str2));
	}

}
