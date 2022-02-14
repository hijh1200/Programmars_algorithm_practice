package Programmars_algorithm_practice.Level_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class cache {
	public static int solution(int cacheSize, String[] cities) {
		if(cacheSize == 0) return cities.length * 5;
		for(int i=0; i<cities.length; i++) cities[i] = cities[i].toLowerCase();
		
        Queue<String> cache = new LinkedList<>();
		ArrayList<String> list = new ArrayList<>();
		cache.add(cities[0]);
		list.add(cities[0]);
		int time = 5;
		
        for(int i=1; i<cities.length; i++) { System.out.println(list); System.out.println(cache);
        	if(list.contains(cities[i])) {
        		if(list.size() < cacheSize) {
        			list.add(cities[i]);
        		}
        		else {
            		list.remove(cities[i]);
            		list.add(cities[i]);
        		}
        		time+=1;
        	}
        	else {
        		list.remove(0);
        		time+=5;
        	}
    		
        }
        return time;
    }
	
	
	public static void main(String[] args) {
		String[] cities =
		{"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"};
		System.out.println(solution(3, cities));
	}

}
