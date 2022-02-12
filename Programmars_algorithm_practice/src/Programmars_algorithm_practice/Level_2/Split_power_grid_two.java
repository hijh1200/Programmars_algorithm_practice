package Programmars_algorithm_practice.Level_2;

import java.util.HashSet;
public class Split_power_grid_two {
	public static HashSet<Integer> hs = new HashSet<>();
	public static void search(int[][] wires, boolean[] visit, int pq) {
		for(int i=0; i<wires.length; i++) {
			if(visit[i]) continue;
			
			if(wires[i][0] == pq) {	
				visit[i]= true;
				hs.add(wires[i][1]);
				search(wires, visit, wires[i][1]);
			}
			else if(wires[i][1] == pq) {
				visit[i]= true;
				hs.add(wires[i][0]);
				search(wires, visit, wires[i][0]);
			}
		}
	}
	public static int solution(int n, int[][] wires) {
        int min = 100;
        
        for(int i=0; i<wires.length; i++) {
        	boolean[] visit = new boolean[wires.length];
           	int p = wires[i][0];
            int q = wires[i][1];
            visit[i] = true;
            
            hs.add(p);
            search(wires, visit, p);
            int psize = hs.size();
            int qsize = n - psize;
            hs.clear();
            
            if(Math.abs(psize - qsize) < min) min = Math.abs(psize - qsize);
        }
        return min;
    }
	public static void main(String[] args) {
		int[][] wires = {
				{1,3},{2,3},{3,4},{4,5},{4,6},{4,7},{7,8},{7,9}	
		};
		System.out.println(solution(9, wires));
	}

}
