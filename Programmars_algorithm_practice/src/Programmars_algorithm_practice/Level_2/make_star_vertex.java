package Programmars_algorithm_practice.Level_2;

import java.util.ArrayList;
import java.util.Arrays;

public class make_star_vertex {
    public static String[] solution(int[][] line) {
    	ArrayList<long[]> list = new ArrayList<>();
        for(int i=0; i<line.length-1; i++) {
        	for(int j=i+1; j<line.length; j++) {
        		long a = line[i][0];
                long b = line[i][1];
                long e = line[i][2];
                long c = line[j][0];
                long d = line[j][1];
                long f = line[j][2];
                
                long denominator = (a * d) - (b * c);
                if(denominator == 0) continue;
                long numerator1 = (b * f) - (e * d);
                long numerator2 = (e * c) - (a * f);
                if(numerator1 % denominator != 0 || numerator2 % denominator != 0) continue;
        		
                int x  = (int) (numerator1 / denominator);
                int y = (int) (numerator2 / denominator);
                list.add(new long[] {(long)x, (long)y});
        	}
        }
//        for(int i=0; i<list.size(); i++) System.out.println(Arrays.toString(list.get(i)));
//        System.out.println();
//        //
        long xmax = Integer.MIN_VALUE;
        long xmin = Integer.MAX_VALUE;
        long ymax = Integer.MIN_VALUE;
        long ymin = Integer.MAX_VALUE;
        for(int i=0; i<list.size(); i++) {
        	if(list.get(i)[0] > xmax) xmax = list.get(i)[0];
        	if(list.get(i)[0] < xmin) xmin = list.get(i)[0];
        	if(list.get(i)[1] > ymax) ymax = list.get(i)[1];
        	if(list.get(i)[1] < ymin) ymin = list.get(i)[1];
        }
//        System.out.println(xmax +"/"+xmin +"/"+ymax +"/"+ymin );
//        System.out.println();
//        //
        ArrayList<long[]> newList = new ArrayList<>();
        for(int i=0; i<list.size(); i++) {
        	newList.add(new long[] {ymax - list.get(i)[1], list.get(i)[0] - xmin});
        }
//        for(int i=0; i<list.size(); i++) System.out.println(Arrays.toString(newList.get(i)));
//        System.out.println();
//        //
        long columns = xmax - xmin + 1;
        long rows = ymax - ymin + 1;
        char[][] map = new char[(int) rows][(int) columns];
        for(int i=0; i<rows; i++) Arrays.fill(map[i], '.');
        for(int i=0; i<newList.size(); i++) map[(int) newList.get(i)[0]][(int) newList.get(i)[1]] = '*';
//        for(int i=0; i<rows; i++) System.out.println(Arrays.toString(map[i]));
//        System.out.println();
//        //
        String[] answer = new String[(int) rows];
        for(int i=0; i<rows; i++) answer[i] = new String(map[i]);
        return answer;
    }
	public static void main(String[] args) {
		int[][] line = {
				{2, -1, 4}, 
				{-2, -1, 4},
				{0, -1, 1}, 
				{5, -8, -12}, 
				{5, 8, 12}	
		};
		System.out.println(Arrays.toString(solution(line)));
	}

}
