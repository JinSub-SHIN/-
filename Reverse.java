package march;

class solution {
	
	/**
	 * ���� : �ڿ��� n�� ������ �� �ڸ� ���ڸ� ���ҷ� ������ �迭 ���·� �������ּ���. ������� n�� 12345�̸� [5,4,3,2,1]�� �����մϴ�.
	 * 
	 * ���� ���� : n�� 10,000,000,000������ �ڿ����Դϴ�.	 
	 */
  
	public int[] solution(long n) {
               
      String str = Long.toString(n);
      String[] strArr = str.split(""); //�ѱ��ھ��ɰ���
      int le = str.length();
      int[] answer = new int[le];
      int num = 0;
        while(num<str.length()){
            answer[num] = Integer.parseInt(strArr[le-1]);
            num++;
            le--;
        }
         return answer;
      
//       String str = Long.toString(n);
//       int[] answer = new int[str.length()];
//       int num = 0;
      
//       while(n>0){
//           answer[num] = (int)(n%10); // ������ �������� ó������ ��ġ��Ŵ
//           n = n/10;
//           num++;
//       }
//         return answer;
       
  }
}