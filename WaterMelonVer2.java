package march;

public class WaterMelonVer2 {

	public static void main(String[] args) {
		
		/*
		 * https://programmers.co.kr/learn/courses/30/lessons/12922
		 */
		
		int n = 5;
		StringBuilder sb = new StringBuilder();		
		int num = n/2;		
				
		if(n%2==0) {			
			for(int i=1; i<=num ; i++) {
				sb.append("수박");
			}
		} else {			
			for(int i=1; i<=num ; i++) {
				sb.append("수박");				
			}
			sb.append("수");
			
		}
		
		System.out.println(sb.toString());

	}

}
