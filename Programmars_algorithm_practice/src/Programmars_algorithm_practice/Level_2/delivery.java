package Programmars_algorithm_practice.Level_2;
import java.util.Arrays;
import java.util.PriorityQueue;
public class delivery {
	public static int solution(int N, int[][] road, int K) {
		int[][] map = new int[N+1][N+1];
		for(int i=0; i<N+1; i++) Arrays.fill(map[i], Integer.MAX_VALUE);
		int[] dist = new int[N+1];
		Arrays.fill(dist, Integer.MAX_VALUE);
		dist[1] = 0;
		
		for(int i=0; i<road.length; i++) {
			if(map[road[i][0]][road[i][1]] > road[i][2]) {
				map[road[i][0]][road[i][1]] = road[i][2];
				map[road[i][1]][road[i][0]] = road[i][2];
			}
		}
		
        PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> {
        	return Integer.compare(o1[0], o2[0]);
        });
        pq.add(new int[] {dist[1], 1});
		
        while(!pq.isEmpty()) {
        	int[] current = pq.poll();
        	
        	for(int i=2; i<N+1; i++) {
        		if(map[current[1]][i] != Integer.MAX_VALUE) {
        			if(dist[i] > current[0] + map[current[1]][i]) {
        				dist[i] = current[0] + map[current[1]][i];
        				pq.add(new int[] {dist[i], i});
        			}
        		}
        	}
        }
//        for(int i=0; i<N+1; i++) System.out.println(Arrays.toString(map[i]));
//		System.out.println("/");
//		System.out.println(Arrays.toString(dist));
        
		int cnt = 0;
		for(int i=1; i<N+1; i++) {
			if(dist[i] <= K) cnt++;
		}
		
        return cnt;
    }
	public static void main(String[] args) {
		int[][] road = {
				{1,2,1},{1,3,2},{2,3,2},{3,4,3},{3,5,2},{3,5,3},{5,6,1}
				};
		System.out.println(solution(6, road, 4));
	}

}
