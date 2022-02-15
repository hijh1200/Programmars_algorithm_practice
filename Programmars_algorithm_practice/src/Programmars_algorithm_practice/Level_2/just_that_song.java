package Programmars_algorithm_practice.Level_2;
import java.util.ArrayList;
public class just_that_song {
	public static String solution(String m, String[] musicinfos) {
		int[] musicLen = new int[musicinfos.length];
        String[] musicName = new String[musicinfos.length];
        
        for(int k=0; k<musicinfos.length; k++) {
            String[] music = musicinfos[k].split(",");
            //System.out.println(Arrays.toString(music));
        
            int hour = Integer.parseInt(music[1].substring(0,2)) - Integer.parseInt(music[0].substring(0,2));
            int minute = Integer.parseInt(music[1].substring(3,5)) - Integer.parseInt(music[0].substring(3,5));
            int len = hour*60 + minute;
            //System.out.println(len);
        
            ArrayList<String> list = new ArrayList<>();
            for(int i=0; i<music[3].length()-1; i++) {
                if(music[3].charAt(i+1) == '#') {
                    list.add(music[3].charAt(i)+"" + music[3].charAt(i+1)+"");
                    i++;
                } else list.add(music[3].charAt(i)+"");
            }
            if(music[3].charAt(music[3].length()-1) != '#') {
                list.add(music[3].charAt(music[3].length()-1)+"");
            }
            //System.out.println(list);
        
        
            String str = "";
            for(int i=0; i<len; i++) str += list.get(i%list.size());
            //System.out.println(str);
        
            for(int i=0; i<str.length() - m.length() + 1; i++) {
                if(m.equals(str.substring(i, i+m.length()))) {
                    if(i+m.length()<str.length() && str.charAt(i+m.length())=='#') continue;
                    musicLen[k] = len;
                    musicName[k] = music[2];
                }
            }
        }
        // System.out.println(Arrays.toString(musicLen));
        // System.out.println(Arrays.toString(musicName));
        
        int idx = -1;
        int max = -1;
        for(int i=0; i<musicLen.length; i++) {
            if(musicLen[i] > max) {
                max = musicLen[i];
                idx = i;
            }
        }
        
        if(max == 0) return "(None)";
        else return musicName[idx];
    }
	public static void main(String[] args) {
		String[] musicinfos = {"12:00,12:14,HELLO,CDEFGAB", "13:00,13:05,WORLD,ABCDEF"};
		System.out.println(solution("ABCDEFG", musicinfos));
	}

}
