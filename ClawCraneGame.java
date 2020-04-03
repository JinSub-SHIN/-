package march;

import java.util.ArrayList;
import java.util.List;

public class ClawCraneGame {

		/*
	   https://programmers.co.kr/learn/courses/30/lessons/64061	 
		*/
	
	public static void main(String[] args) {

		int[][] board = { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 3 }, { 0, 2, 5, 0, 1 }, { 0, 2, 4, 4, 2 },
				{ 0, 5, 1, 3, 1 } };
		int[] moves = {1, 1, 1, 2, 3, 2, 4, 5, 4, 5, 2, 5, 2, 3};
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> index = new ArrayList<Integer>();		

		for (int i = 0; i < moves.length; i++) {
			int moveint = moves[i];
			for (int j = 0; j < board.length; j++) {
				int boardint = board[j][moveint - 1];
				if (boardint == 0 && j < board.length - 1) {
					continue;
				} else {
					// System.out.println(boardint);
					list.add(boardint);
					board[j][moveint - 1] = 0;
					break;					
				}
			}
		}

		System.out.println(list);	
		int pull = list.size();

		for (int i = 0; i < list.size(); i++) {			
			if(list.get(i)==0) {				
				index.add(i);					
			}			
		}
				
		for(int i=0 ; i<index.size() ; i++) {
			int removeindex = index.get(i);
			list.remove(removeindex-i);
		}
		
		System.out.println(list);
		
		for(int i = 1 ; i<list.size(); i++) {
			if(i==1) {
				if(list.get(i-1) == list.get(i)) {
					list.remove(i - 1);
					list.remove(i - 1);
					i = i - 1;
				}
			} else {
				if (list.get(i - 1) == list.get(i)) {
					list.remove(i - 1);
					list.remove(i - 1);
					i = i - 2;
				}
			}
		}
				
		System.out.println(list);

		int indexsize = index.size();
		int delete = list.size();
		int answer = pull - delete - indexsize;

		System.out.println(answer);

	}

}
