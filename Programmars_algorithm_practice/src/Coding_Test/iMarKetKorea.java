package Coding_Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;
public class iMarKetKorea {
	public static int[] solution(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i: arr) {
        	if(!hm.containsKey(i)) hm.put(i, 1);
        	else hm.put(i, hm.get(i)+1);
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int key: hm.keySet()) {
        	if(hm.get(key) == 1) pq.add(key);
        }
        
        
        int size = pq.size();
        if(size==0) {
            int[] answer = {-1};
            return answer;
        }
        
        
        int answer[] = new int[size];
        for(int i=0; i<size; i++) answer[i] = pq.poll();
        
        return answer;
    }
	public static void main(String[] args) {
		int[] arr = {3, 4, 4, 2, 5, 2, 5, 5};
		System.out.println(Arrays.toString(solution(arr)));
	}

}
