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
				sb.append("����");
			}
		} else {			
			for(int i=1; i<=num ; i++) {
				sb.append("����");				
			}
			sb.append("��");
			
		}
		
		System.out.println(sb.toString());

	}

}
