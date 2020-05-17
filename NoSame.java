package algoTest;

import java.util.ArrayList;
import java.util.List;

public class NoSame {

	public static void main(String[] args) {

		int[] arr = { 1, 1, 3, 3, 0, 1, 1 };	
		List<Integer> list = new ArrayList<Integer>();		
		int same = -1;		
		
		for(int i : arr) {			
			if(same==i) {
				continue;
			} else {				
				list.add(i);
				same = i;							
			}			
		}
		
		int[] answer = new int[list.size()];
		
		for(int i=0 ; i<list.size(); i++) {
			answer[i] = list.get(i);
		}

	}

}
