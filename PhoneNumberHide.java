package algoTest;

public class PhoneNumberHide {

	/*
	 *  https://programmers.co.kr/learn/courses/30/lessons/12948
	 */
	
	class Solution {
	    public String solution(String phone_number) {
	        
	        int length = phone_number.length();
	        StringBuffer sb = new StringBuffer();
	        for(int i=0 ; i<length-4 ; i++){
	            sb.append("*");
	        }
	        sb.append(phone_number.substring(length-4, length));
	        
	        String answer = sb.toString();
	        return answer;
	    }
	}
	
}
