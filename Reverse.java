package march;

class solution {
	
	/**
	 * 문제 : 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
	 * 
	 * 제한 조건 : n은 10,000,000,000이하인 자연수입니다.	 
	 */
  
	public int[] solution(long n) {
               
      String str = Long.toString(n);
      String[] strArr = str.split(""); //한글자씩쪼개기
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
//           answer[num] = (int)(n%10); // 나눠서 나머지를 처음으로 배치시킴
//           n = n/10;
//           num++;
//       }
//         return answer;
       
  }
}