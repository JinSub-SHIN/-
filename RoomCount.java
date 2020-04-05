package april;

import java.util.HashSet;
import java.util.Set;

public class RoomCount {
	
	public static void main(String[] args) {
		
		/*
			https://programmers.co.kr/learn/courses/30/lessons/49190
		*/
		
		int[] array = { 6, 6, 6, 4, 4, 4, 2, 2, 2, 0, 0, 0, 1, 6, 5, 5, 3, 6, 0 };
		int[] xy = new int[2];
		//좌표로이용할 배열선언
		Set<String> set = new HashSet<String>();
		Set<String> set2 = new HashSet<String>();
		set.add("0,0");
		int check = 0;
		String linename = "00";

		//점과점이 다시만날경우 도형1개추가..
		for (int i = 0; i < array.length; i++) {
			switch (array[i]) {
			case 0: xy[1] += 1; //y축 +1
				break;
			case 1: xy[0] += 1; xy[1] += 1; //x축,y축 +1
				break;
			case 2: xy[0] += 1; //x축 +1
				break;
			case 3: xy[0] += 1; xy[1] += -1; //x축 +1 , y축 -1
				break;
			case 4: xy[1] += -1; // y축 -1
				break;
			case 5: xy[0] += -1; xy[1] += -1; //x축 -1, y축 -1
				break;
			case 6: xy[0] += -1; //x축 -1
				break;
			case 7: xy[0] += -1; xy[1] += 1; //x축-1 y축 +1 
				break;
			}			
//			System.out.print("("+xy[0]+","+xy[1]+")"); //좌표출력
			linename += Integer.toString(xy[0])+Integer.toString(xy[1]);
			System.out.println(linename);
			set2.add(linename);
			linename = Integer.toString(xy[0])+Integer.toString(xy[1]);
			
			boolean result = set.add(xy[0]+","+xy[1]);
			if(!result) {
				check++;
			}
		}					
				
			System.out.println(check);
			System.out.println(set2.size());
			
			// 미완성 ---
		
		
	}

}
