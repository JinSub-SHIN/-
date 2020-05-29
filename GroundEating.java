package algoTest2;
		
		/*
		 *  https://programmers.co.kr/learn/courses/30/lessons/12913
		 */

class Solution10 {
    int solution(int[][] land) {    	                        
        for(int i=1 ; i<land.length ; i++) {        
        	land[i][0] += (Math.max(Math.max(land[i-1][1] ,land[i-1][2]), land[i-1][3]));
        	land[i][1] += (Math.max(Math.max(land[i-1][0] ,land[i-1][2]), land[i-1][3]));
        	land[i][2] += (Math.max(Math.max(land[i-1][0] ,land[i-1][1]), land[i-1][3]));
        	land[i][3] += (Math.max(Math.max(land[i-1][0] ,land[i-1][1]), land[i-1][2]));        	
        }        
       return  Math.max(Math.max(Math.max(land[land.length-1][0], land[land.length-1][1]), 
    		   land[land.length-1][2]), land[land.length-1][3]);
     }
}

public class GroundEating {

	public static void main(String[] args) {
		
		Solution10 sol = new Solution10();
		
		int[][] land = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
		
		System.out.println(sol.solution(land));
		
	}
}


