package Programmars_algorithm_practice.Level_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
public class tuple {
	 public static int[] solution(String s) {
	        s = s.substring(2, s.length()-2);
	        String[] str = s.split("\\}\\,\\{");
	        Arrays.sort(str, new Comparator<String>(){
	           public int compare(String o1, String o2) {
	               return Integer.compare(o1.length(), o2.length());
	           } 
	        });
	        
	        ArrayList<Integer> res = new ArrayList<Integer>();
	        for(String x: str) {
	            String[] temp = x.split("\\,");
	            for(String t: temp) {
	                int n = Integer.parseInt(t);
	                if(!res.contains(n)) {
	                    res.add(n);
	                }
	            }
	        }
	        
	        int[] answer = new int[res.size()];
	        for(int i=0; i<res.size(); i++) {
	            answer[i] = res.get(i);
	        }
	        
	        return answer;
	    }
	public static void main(String[] args) {
		String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
		System.out.println(solution(s));
	}

}
