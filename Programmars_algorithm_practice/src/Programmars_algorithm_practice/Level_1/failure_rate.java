package Programmars_algorithm_practice.Level_1;
import java.util.*;
public class failure_rate {
	public static int[] solution(int N, int[] stages) {
		Arrays.sort(stages);
		double[][] rate = new double[N][2];
		int idx = 0;
		int player = stages.length;
		
		for(int i=1; i<=N; i++) {
			int a = 0;
			double fr = 0;
			
			for(int j=idx; j<stages.length; j++) {
				if(stages[j] >= i ) {
					if(stages[j] == i) {
						a++;						
						continue;
					}
					else {
						idx = j;
						break;
					}
				}
			}
			if(a==0) {
				fr = 0;
			}
			else {
				fr = (double)a / (double)player;
			}
			rate[i-1][1] = i;
			rate[i-1][0] = fr;
			player -= a;
		}
		
		Arrays.sort(rate, new Comparator<double[]>() {
		    public int compare(double[] o1, double[] o2) {
		        return Double.compare(o2[0], o1[0]);
		    }
		});

		int[] answer = new int[rate.length];
		for(int i=0; i<rate.length; i++) {
			answer[i] = (int) rate[i][1];
		}
		return answer;
	}

	public static void main(String[] args) {
		int N = 4;
		int[] stages = {3,2,5,4,2};
		System.out.println(Arrays.toString(solution(N, stages)));
	}

}
