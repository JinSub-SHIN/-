package algoTest;

public class BaseString {
	
	/*
	 *  https://programmers.co.kr/learn/courses/30/lessons/12918
	 */

	class Solution {
	    public boolean solution(String s) {
	        
	        boolean answer = false;
	        
	        if(s.length() == 4 || s.length()== 6){            
	            try{
	            Integer.parseInt(s);
	                answer = true;
	            } catch (NumberFormatException e){
	                answer = false;
	            }            
	        }        
	        return answer;
	    }
	}
	
}
