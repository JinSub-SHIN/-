package algoTest;

public class Mathsqrt_pow {

	/*
	 *  https://programmers.co.kr/learn/courses/30/lessons/12934
	 */
	
	class Solution {
	    public long solution(long n) {
	        
	        double dou = Math.sqrt(n);
	        double check = Math.ceil(dou);
	        
	        if(dou == check){
	            return (long)Math.pow(dou+1 , 2);
	        } else {
	            return -1;
	        }        
	    }
	}
}
