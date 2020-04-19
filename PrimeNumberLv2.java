package april;

import java.util.*;

	
	/*
	 *  <����>
	 *  https://programmers.co.kr/learn/courses/30/lessons/42839
	 */

	/*
	 *  <�����ڷ�>
	 *  https://selina-park.tistory.com/128
	 */


class Solution {
    static Set<Integer> combinationList = new HashSet<>();
    // �Ҽ� �Ǻ��ϱ� boolean
    public static boolean isPrimeNumber(int N){
        // �Ҽ��� 2���� �����Ѵ�.
        //System.out.println(N);
        if(N <=1){
            return false;
        }
        // �Ҽ��� �ƴ� ��� �ٷ� return true;
        for(int i=2; i<N; i++){            
            if(N%i == 0){
                return false;
            }
        }
        return true;
    }    
       
    static void comb(int[] num, boolean[] visited, int r, String str) {
        if(r == -1){
            // ����� ������ ���º�����.. (���ѹݺ�x)
            return;
        }
        if(isPrimeNumber(Integer.parseInt(str))){
            combinationList.add(Integer.parseInt(str));
        }
        for(int i=0; i<num.length; i++){
            if(visited[i] == false){
                visited[i] = true;
				comb(num, visited, r - 1, str + String.valueOf(num[i]));
                visited[i] = false;
            }
        }
        return;
    }

    public int solution(String numbers) {
        //String���� �� ���ڹ迭(String type)�� int�迭�� �����.
        int[] num = new int[numbers.length()];
        boolean[] visited = new boolean[num.length];
        
        for(int i=0; i<numbers.length(); i++){
            num[i] = numbers.charAt(i) - '0';
        }

        for(int i=0; i<num.length; i++){
            visited[i] = true;
            comb(num, visited, num.length, String.valueOf(num[i]));
            visited[i] = false;
        }
        return combinationList.size();
    }
}