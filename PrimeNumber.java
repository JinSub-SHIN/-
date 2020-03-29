package march;

public class PrimeNumber {

	public static void main(String[] args) {
		
		/**
		 * 문제URL : https://programmers.co.kr/learn/courses/30/lessons/12921
		 */

		int num = 1000000;
		int [] allArray = new int[num+1];
		int check = 0;
		
		for(int i=2 ; i<num+1 ; i++) {
			allArray[i] = i;			
			
		}
				
		for(int i=2 ; i<Math.sqrt(allArray.length) ; i++) {
				if(allArray[i] == 0) {
					continue;
				}
			for(int t=2*i ; t<=num ; t=t+i) {
				allArray[t] = 0;
			}
		}
		
		for(int i=0 ; i<allArray.length ; i++) {
			if(allArray[i] !=0) {
				check++;
			}
		}
		
		System.out.println("소수의개수" + check);
		
	}

}
