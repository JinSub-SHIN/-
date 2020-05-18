package algoTest;

import java.util.*;

/*
 *  https://programmers.co.kr/learn/courses/30/lessons/64063
 */

public class HotelRoomVer2 {

	    public static void main(String[] args) {
	    	
	    	Solution_8 sol = new Solution_8();
	    	
	        System.out.println(sol.solution(10, new long[]{1,3,4,1,3,1}));
	    }
	}

class Solution_8 {

    private Map<Long, Long> map = new HashMap<Long, Long>();   
    
    public long[] solution(long k, long[] room_number) {
    	
        int length = room_number.length;        
        long[] answer = new long[length];
        
        for (int i = 0; i <length; i++) {        	
            long lo=room_number[i];
            answer[i] = findRoom(lo);            
        }
        
        System.out.println(Arrays.toString(answer));
        
        return answer;
    }

    public long findRoom(long lo) {
        
        if(!map.containsKey(lo)) { // 손님이 원하는 방이 있을때..        
        	map.put(lo, lo + 1);        
            return lo;
        }
        
        //손님이 원하는 방이 없을때..
        
        map.put(lo, findRoom(map.get(lo)));       
        return map.get(lo);
    }


}
