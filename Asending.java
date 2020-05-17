package algoTest;
import java.util.*;

public class Asending {

	/*
	 *   https://programmers.co.kr/learn/courses/30/lessons/12917
	 */
	
	class Solution {
	    public String solution(String s) {
	        
	        String [] array = s.split("");
	        List<String> list = new ArrayList<String>();
	        for(String str : array){
	            list.add(str);
	        }
	        Collections.sort(list, new AscendingString());        
	        StringBuilder sb = new StringBuilder();
	        
	        for(String str : list){
	            sb.append(str);
	        }
	        
	        String answer = sb.toString();
	        return answer;
	    }
	}

	class AscendingString implements Comparator<String> {     
	    @Override
	    public int compare(String a, String b) { 
	        return b.compareTo(a); 
	    } 
	}
	
}
