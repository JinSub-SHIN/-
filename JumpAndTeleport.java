package algoTest2;

public class JumpAndTeleport {

	/*
	 *  https://programmers.co.kr/learn/courses/30/lessons/12980
	 */
	
	public static void main(String[] args) {
		
		Solution5 sol = new Solution5();
		System.out.println(sol.solution(5000));
	}
	
}

class Solution5 {
    public int solution(int n) {    	
        int ans = 0;
        while(n!=0) {
        	
        	if(n%2==0) {
        		n = n/2;
        	} else {
        		n--;
        		ans++;
        	}        	
        }        
        return ans;
    }
}
