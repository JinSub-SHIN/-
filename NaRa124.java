package april;

public class NaRa124 {

	public static void main(String[] args) {
		
		int n = 15; // �������� �μ��� ������ n��
		int check = 1; 
		int sum = 0;
		int beforesum = 0;
		
		while(true) {
			
			int pow = (int)Math.pow(3, check);
			sum += pow;
			if(sum>=n) break;			
			check++;	
		}
		
		System.out.println("�ڸ��� : "+check); // ���ڸ� �������� �˷��ִ� check
		System.out.println("�ѳ�Ÿ���� �ִ� ���� : " +sum);
		
		for(int i=1 ; i<check ; i++) {			
			int pow = (int)Math.pow(3, i);
			beforesum += pow;			
		}
		
		int result = n-beforesum;				
		System.out.println("�ش��ڸ������� ��Ÿ�� ���� : "+result);
		
		StringBuilder sb = new StringBuilder();
		
		for(int j=0 ; j<check ; j++) {			
			
			if(j==0) {				
				int i = result%3;				
				if(i==0) {
					sb.append(4);
				} else {
					sb.append(i);
				}
				
				result = (int)Math.ceil(result/3.0);
				continue;
			}
			
			int i = result%3;			
			if(i==1) {
				sb.append(i);
			} else if(i==2) {
				sb.append(i);
			} else if(i==0) {
				sb.append(4);
			}
			
			result = (int)Math.ceil(result/3.0);
			
		}
		
		System.out.println(sb);
		StringBuilder answer = sb.reverse();
		System.out.println("���� : " +answer.toString());
				

	}

}
