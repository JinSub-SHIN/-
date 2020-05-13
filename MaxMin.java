package algoTest;

public class MaxMin {

	public static void main(String[] args) {
				
		int n = 15;
		int m = 12;
				
		Solution3 so = new Solution3();
		int [] answer = so.solution(n, m);
		System.out.println(answer[0] +"/"+answer[1]);
		
		
	}

}

class Solution3 {
    public int[] solution(int n, int m) {
        
        int [] answer = new int[2];
                       
        if(n>m){
           int change = n;
            n = m;
            m = change;            
        }
        
        int a = n*m;

        while(answer[0] == 0) {        
	        if(n%m==0) {	        	
	        	answer[0] = m;	        	
	        } else {        	
	        	int temp = n%m;
	        	n = m;
	        	m = temp;	        	
	        }        
        }
        
        answer[1] = a/answer[0];        
        
        return answer;
    }
}
