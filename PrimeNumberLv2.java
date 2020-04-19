package april;

import java.util.*;

	
	/*
	 *  <문제>
	 *  https://programmers.co.kr/learn/courses/30/lessons/42839
	 */

	/*
	 *  <참고자료>
	 *  https://selina-park.tistory.com/128
	 */


class Solution {
    static Set<Integer> combinationList = new HashSet<>();
    // 소수 판별하기 boolean
    public static boolean isPrimeNumber(int N){
        // 소수는 2부터 시작한다.
        //System.out.println(N);
        if(N <=1){
            return false;
        }
        // 소수가 아닐 경우 바로 return true;
        for(int i=2; i<N; i++){            
            if(N%i == 0){
                return false;
            }
        }
        return true;
    }    
       
    static void comb(int[] num, boolean[] visited, int r, String str) {
        if(r == -1){
            // 요놈이 봤을때 상태변수값.. (무한반복x)
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
        //String으로 된 숫자배열(String type)을 int배열로 만들기.
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