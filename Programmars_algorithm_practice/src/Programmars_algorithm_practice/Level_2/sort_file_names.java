package Programmars_algorithm_practice.Level_2;

import java.util.Arrays;

public class sort_file_names {
	public static String[] solution(String[] files) {
        String[][] newFiles = new String[files.length][3];
        
        
        for(int i=0; i<files.length; i++) {
            int idx = 0;
            for(int j=0; j<files[i].length(); j++) {
                if(Character.isDigit(files[i].charAt(j))) {
                    newFiles[i][0] = files[i].substring(0, j);
                    idx = j; break;
                } 
            }
            for(int j=idx; j<files[i].length(); j++) {
                if(!Character.isDigit(files[i].charAt(j))) {
                    newFiles[i][1] = files[i].substring(idx, j);
                    newFiles[i][2] = files[i].substring(j, files[i].length());  
                    break;
                }
                else if(j == files[i].length()-1) {
                    newFiles[i][1] = files[i].substring(idx, j+1);
                    newFiles[i][2] = "";
                    break;
                }
            }
        }
        
        
        Arrays.sort(newFiles, (o1,o2) -> {
            if(o1[0].toLowerCase().equals(o2[0].toLowerCase())) {
                return Integer.compare(Integer.parseInt(o1[1]),Integer.parseInt(o2[1]));
            }
            else return o1[0].toLowerCase().compareTo(o2[0].toLowerCase());
        });
        
        
        String[] answer = new String[files.length];
        for(int i=0; i<answer.length; i++) {
            answer[i] = newFiles[i][0] + newFiles[i][1] + newFiles[i][2];
        }
        return answer;
    }
	public static void main(String[] args) {
		String[] str = {"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"};
		System.out.println(solution(str));
	}

}
