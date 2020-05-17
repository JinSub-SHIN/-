package algoTest;

public class MideumText {
	
	/*
	 *   https://programmers.co.kr/learn/courses/30/lessons/12903
	 */	
	
	class Solution {
	    public String solution(String s) {
	        
	        String answer = "";
	        String [] array = s.split("");			
			if(array.length%2 == 1) {			
				answer = array[array.length/2];			
			} else {			
				answer = array[array.length/2-1] + array[array.length/2];			
			}
	        return answer;
	    }

	}
}
