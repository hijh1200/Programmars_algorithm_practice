package Programmars_algorithm_practice.Level_1;
// �ű� ���̵� ��õ
public class New_ID_recommendation {
	public static String solution(String new_id) {
        new_id = new_id.toLowerCase();			// 1�ܰ�
      
        for(int i=0; i<new_id.length(); i++) {			// 2�ܰ�
        	char letter = new_id.charAt(i);
        	if(Character.isLetterOrDigit(letter) || letter == '-' || letter == '_' || letter == '.') {
        	}else {
        		StringBuilder temp = new StringBuilder(new_id);
        		temp = temp.deleteCharAt(i);
        		new_id = temp.toString();
        		i--;
        	}
        }
     
        if(new_id.length() > 0) {
        	for(int i=0; i<new_id.length()-1; i++) {				// 3�ܰ�
            	if(new_id.charAt(i) == '.' && new_id.charAt(i+1) == '.') {
            		StringBuilder temp = new StringBuilder(new_id);
            		temp = temp.deleteCharAt(i);
            		new_id = temp.toString();
            		i--;
            	}
            }
        }
        
		if(new_id.length() > 0) {
			if(new_id.charAt(0) == '.') {						// 4�ܰ�
				StringBuilder temp = new StringBuilder(new_id);
	    		temp = temp.deleteCharAt(0);
	    		new_id = temp.toString();
			}
		}
		
		if(new_id.length() > 0) {
			if(new_id.charAt(new_id.length()-1) == '.') {
				StringBuilder temp = new StringBuilder(new_id);
	    		temp = temp.deleteCharAt(new_id.length()-1);
	    		new_id = temp.toString();
			}
		}		
		
        if(new_id.length() == 0) new_id += 'a';			// 5�ܰ�
        
        if(new_id.length() > 15) {					// 6�ܰ�
        	new_id = new_id.substring(0, 15);
        }
        if(new_id.length() > 0 && new_id.charAt(new_id.length()-1) == '.') {
        	StringBuilder temp = new StringBuilder(new_id);
    		temp = temp.deleteCharAt(new_id.length()-1);
    		new_id = temp.toString();
        }
        
        if(new_id.length() <= 2) {						// 7�ܰ�
        	int n = 3 - new_id.length();
        	for(int i=0; i<n; i++) {
        		new_id = new_id + new_id.charAt(new_id.length()-1);
        	}
        }
    
		String answer = new_id;
        return answer;
    }
	
	public static void main(String[] args) {
		String new_id = "abcdefghijklmn.p";
		System.out.println(solution(new_id));
	}
}
