package algoTest2;

public class Carpet {

	/*
	 *  https://programmers.co.kr/learn/courses/30/lessons/42842
	 */
	
}

class Solution4 {
    public int[] solution(int brown, int yellow) {
        
        int width = 0;
        int height = 0;
        
        for(int i=1 ; i< brown/4 ; i++){
            if((brown/2-2-i)*i == yellow){
                height = i;
                width = yellow/height;
                break;
            }
        }               
        int[] answer = {width+2, height+2};
        return answer;
    }
}