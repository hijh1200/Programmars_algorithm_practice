package Coding_Test;
import java.util.*;
public class test1 {

	public static int solution(int[][] customer) {
		Arrays.sort(customer, new Comparator<int[]>() { 
			@Override public int compare(int[] o1, int[] o2) { 
				if(o1[0] == o2[0]) { 
					return o1[1] - o2[1]; 
					}else { 
						return o1[0] - o2[0]; 
						} 
				} 
			}
		);
		int diff = 0;
		int start = customer[0][0];
		int max = customer[0][1];
		for(int i=0; i<customer.length-1; i++) {
			if(max >= customer[i+1][0]) {
				if(max >= customer[i+1][1]) {
					continue;
				}
				else {
					max = customer[i+1][1];
				}
			}
			else {
				diff = diff + (customer[i+1][0] - max);
				max = customer[i+1][1];
			}
		}
		System.out.println(diff);
		System.out.println(Arrays.toString(customer[0]));
		
		
		return (max - start) - diff;
	}
	
	public static void main(String[] args) {
		int[][] customer = {
				{1,4},
				{3,5},
				{8,10}
				};
		System.out.println(solution(customer));
	}

}
