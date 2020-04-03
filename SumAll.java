package march;

public class SumAll {

	public static void main(String[] args) {
		
		//https://programmers.co.kr/learn/courses/30/lessons/12912
		
		int a = 100;		
		int b = 0;	
		long answer = 0;
		
		if(a<b) {
			for(int i=a ; i<=b ; i++) {
				answer += i;
			}
		} else {
			for(int i=b ; i<=a ; i++) {
				answer += i;
			}
		}
		
		System.out.println(answer);
				
	
		
	}

}
