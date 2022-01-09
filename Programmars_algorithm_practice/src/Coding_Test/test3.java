package Coding_Test;
import java.util.*;
public class test3 {
	public static long func(long[] s, int r, int q) {
		long res = 0;
		for(int i=0; i<s.length; i++) {
			res = (long) (res + s[i] * Math.pow(r, i));
		}
		res = (long) Math.pow(res, q);
		return res;
	}
	
	static ArrayList<String> abc = new ArrayList<String>();
	public static void powerSet(long[] arr, boolean[] visited, int n, int idx) {
        if (idx == n) {
        	if(solve(arr, visited, n) != "") {
        		abc.add(solve(arr, visited, n));
        	}
            return;
        }
        visited[idx] = false;
        powerSet(arr, visited, n, idx + 1);

        visited[idx] = true;
        powerSet(arr, visited, n, idx + 1);
    }
	public static String solve(long[] arr, boolean[] visited, int n) {
		String str = "";
        for (int i = 0; i < n; i++) {
            if (visited[i] == true)
            	str = str + Long.toString(arr[i]) + " ";
        }
        return str;
    }

	
	public static long solution(long[] numbers, int q, int r) {
		int n = numbers.length;
        boolean[] visited = new boolean[n];
        powerSet(numbers, visited, n, 0);
        long sum = 0;
//        System.out.println(abc);
        
        for(int i=0; i<abc.size(); i++) {
        	ArrayList<Integer> slist = new ArrayList<Integer>();
        	
        	String strstr = "";
        	for(int j=0; j<abc.get(i).length(); j++) {
        		if(abc.get(i).charAt(j) == ' ') continue;
        		
        		strstr = strstr + abc.get(i).charAt(j);
        		int number = 0;
        		
        		if(abc.get(i).charAt(j+1) == ' ') {
        			number = Integer.parseInt(strstr);
        			slist.add(number);
        			strstr = "";
        		}
        		
        		
        	}
        	//System.out.println(slist);
        	long[] sarr = new long[slist.size()];
        	
        	for(int k=0; k<slist.size(); k++) {
        		sarr[k] = slist.get(k);
        	}
        	sum = sum + func(sarr, r, q);
        	slist.clear();
        }
        
        return (long) (sum % (Math.pow(10, 9) + 7));
	}
	
	public static void main(String[] args) {
		long[] numbers = {1,1,3,9,27};
		int q = 10;
		int r = -1;
		System.out.println(solution(numbers, q, r));
	}

}
