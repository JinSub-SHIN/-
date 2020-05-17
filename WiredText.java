package algoTest;

public class WiredText {

	/*
	 *  https://programmers.co.kr/learn/courses/30/lessons/12930
	 */
	
	public static void main(String[] args) {
				
		Solution_5 sol = new Solution_5();
		String answer = sol.solution("try hello world");
		System.out.println(answer);

	}

}

class Solution_5 {
    public String solution(String s) {
    	
    	String array [] = s.split("");
    	StringBuffer sb = new StringBuffer();
    	int index = 0;
    
    	for(int i=0 ; i<array.length ; i++) {
    		
    		if(array[i].equals("")) {
    			index = 0;
    			sb.append("");
    			continue;
    		}
    		
    		if(index==0 || index%2 ==0) {
    			sb.append(array[i].toUpperCase());
    			index++;
    		} else {
    			sb.append(array[i].toLowerCase());
    			index++;
    		}
    		
    	}    	
    	
    	return sb.toString();
    }
}
