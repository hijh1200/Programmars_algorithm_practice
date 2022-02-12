package Programmars_algorithm_practice.Level_2;

import java.util.ArrayList;
import java.util.Arrays;
public class life_boat {
	public static int solution(int[] people, int limit) {
        Arrays.sort(people);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i: people) list.add(i);
        int cnt = 0;
        
        while(list.size() > 1) {
        	if(list.get(0) + list.get(list.size()-1) <= limit) {
        		list.remove(0);
        	}
        	list.remove(list.size()-1);
        	cnt++;
        }
        if(list.size() == 1) cnt++;
        return cnt;
    }
	public static void main(String[] args) {
		int[] people = {70, 50, 80, 50};
		System.out.println(solution(people, 100));
	}

}
