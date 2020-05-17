package algoTest;

public class Collatz {
	
	/*
	 *  https://programmers.co.kr/learn/courses/30/lessons/12943
	 */

	public static void main(String[] args) {

		Solution_4 sol = new Solution_4();
		int answer = sol.solution(626331);
		System.out.println(answer);

	}

}

class Solution_4 {
	public int solution(int num) {
		int answer = 0;
		long number = (long)num;	
		while (number != 1) {			
			if (number % 2 == 0) {
				number /= 2;
			} else {
				number = 3 * number + 1;
			}
			answer++;
			if (answer == 500) {
				answer = -1;
				break;
			}
		}
		return answer;
	}
}
