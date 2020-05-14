package algoTest;

public class MaxNumber {

	/*
	 *  https://programmers.co.kr/learn/courses/30/lessons/42883
	 */
	
	
	public static void main(String[] args) {
		Solution5 sol = new Solution5();
		sol.solution("4177252841" , 4);
	}
}

class Solution5 {
    public String solution(String number, int k) {
    	
    	String [] strArray = number.split("");
    	int check = 0;
    	int exception = 0;
    	    	
    	try {    		
	    	for(int i=0 ; i<strArray.length ;) {	    		
	    		exception = i;	    		
	    		if(k==0) break;    		
	    		int num = Integer.parseInt(strArray[i]);
	    		 if(check !=0) {
	    			 if(num==check) {
	    				 i++;
	    			 } else if(num>check) {
	    				 strArray[i-1] = "x";
	    				 i = i-1;
	    				 k--;
	    			 } else if(num<check) {
	    				 strArray[i] = "x";
	    				 i = i-1;
	    				 k--;
	    			 }
	    		 }    		
	    	}
	    	
    	} catch (NumberFormatException e) {
    		this.method(exception);
    	}
    	
        String answer = "";
        return answer;
    }
    
    public void method(int checknum) {
    	
    	// 예외 발생시 .. 위의 반복문 해야할일...
    	
    	
    	
    }
    
}