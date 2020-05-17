package algoTest;

public class DFS {
	
	/*
	 *  https://programmers.co.kr/learn/courses/30/lessons/43165
	 */

	public static void main(String[] args) {
		
		int[] numbers = {1, 1, 1, 1, 1};
		int target = 3;
		Solution_1 sol = new Solution_1();
		int answer = sol.solution(numbers, target);
		System.out.println(answer);
		
	}
	
}

class Solution_1 {
	
	 int length;
	 int targetNum;
	 int count; // 전역변수선언
	
    public int solution(int[] numbers, int target) {

    	length = numbers.length;
        targetNum = target;
        count = 0;
        
        DFS(0,0,numbers);
        int answer = count;
        return answer;
    }
    
    public void DFS(int check, int sum, int[] numbers){
    	
        if(check==length){
            if(targetNum==sum){
                count++;
                return;
            }else{
                return;
            }
        }
            int flagnum = numbers[check];
            DFS(check+1, sum+flagnum, numbers); // 더할수도있고
            DFS(check+1, sum-flagnum, numbers); // 뺄수도있고 2경우씩..

    }
}




