package Programmars_algorithm_practice.Level_2;

import java.util.ArrayList;
public class Maximize_Formulas {
	public static ArrayList<String> list = new ArrayList<String>();
	public static long max = 0;
	public static void p(String[] str, int idx, boolean[] visit, String[] res) {
		if(idx == str.length) {
			ArrayList<String> newlist = (ArrayList<String>) list.clone();
			for(int i=0; i<str.length; i++) {
				for(int j=1; j<newlist.size(); j+=2) {
					if(res[i].equals(newlist.get(j))) {
						if(res[i].equals("+")) {
							newlist.set(j, Integer.toString(Integer.parseInt(newlist.get(j-1)) + Integer.parseInt(newlist.get(j+1))));
							newlist.remove(j-1);
							newlist.remove(j);
						}
						else if(res[i].equals("-")) {
							newlist.set(j, Integer.toString(Integer.parseInt(newlist.get(j-1)) - Integer.parseInt(newlist.get(j+1))));
							newlist.remove(j-1);
							newlist.remove(j);
						}
						else if(res[i].equals("*")){
							newlist.set(j, Integer.toString(Integer.parseInt(newlist.get(j-1)) * Integer.parseInt(newlist.get(j+1))));
							newlist.remove(j-1);
							newlist.remove(j);
						}
						j -= 2 ;
					}
				}
			}
			if(max <= Math.abs(Integer.parseInt(newlist.get(0)))) max = Math.abs(Integer.parseInt(newlist.get(0)));
		}
		
		for(int i=0; i<str.length; i++) {
			if(!visit[i]) {
				visit[i] = true;
				res[idx] = str[i];
				p(str, idx+1, visit, res);
				visit[i] = false;
			}
		}
	}
	public static long solution(String expression) {
		String[] str = {"+","-","*"};
		String[] res = new String[str.length];
		boolean[] visit = new boolean[str.length];
		
		String s = "";
		for(int i=0; i<expression.length(); i++) {
			if(expression.charAt(i) == '-' || expression.charAt(i) == '*' || expression.charAt(i) == '+') {
				list.add(s);
				list.add(expression.charAt(i) + "");
				s = "";
			}
			else {
				s += expression.charAt(i);
			}
		}
		list.add(s);
		
		p(str, 0, visit, res);
		
		return max;
	}
	public static void main(String[] args) {
		String expression = "50*6-3*2";
		System.out.println(solution(expression));
	}

}
