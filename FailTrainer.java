package algoTest;

import java.util.*;

public class FailTrainer {
	
	/*
	 *  https://programmers.co.kr/learn/courses/30/lessons/42576
	 */

	public static void main(String[] args) {
		
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		
		Solution_2 sol = new Solution_2();
		String str = sol.solution(participant, completion);
		System.out.println(str);
		
	}
	
}


class Solution_2 {
    public String solution(String[] participant, String[] completion) {
    	
        Map<String, Integer> map = new HashMap<>();
               
        for (String arg : participant) {
        	map.put(arg, map.getOrDefault(arg, 0) + 1);
        }
        for (String arg : completion) {
        	map.put(arg, map.get(arg) - 1);
        }
 
        for (String key : map.keySet()) {
            if (map.get(key) != 0) return key;
        }
 
        return null;
    }
}
