package algoTest;

public class YakSoo {

	/*
	 *  https://programmers.co.kr/learn/courses/30/lessons/12928
	 */
	
	public static void main(String[] args) {
		
		Solution_3 sol = new Solution_3();
		int answer = sol.solution(30);
		System.out.println(answer);
	}
}

class Solution_3 {
	  public int solution(int n) {
	      int answer = 0;	      
	      for(int i =1; i<=n/2; i++){
	          answer += n%i==0 ? i : 0;
	      }
	      answer +=n;
	      return answer;
	  }
	}