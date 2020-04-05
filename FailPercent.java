package april;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class FailPercent {

	public static void main(String[] args) {

		/*
		 * https://programmers.co.kr/learn/courses/30/lessons/42889
		 */

		int N = 5; // 스테이지의 개수
		int[] stages = { 2, 1, 2, 6, 2, 4, 3, 3 }; // 도전중인 스테이지	
		
		int[] answer = new int[N];

		double total = stages.length;

		Map<Integer, Double> tmap = new TreeMap<Integer, Double>();

		for (int i = 0; i < stages.length; i++) {

			int stage = stages[i];
			Double num;

			if (stage > N)
				continue;

			if (tmap.containsKey(stage)) {
				num = tmap.get(stage) + 1.0;  // 해당맵에 스테이지가 있었다면 value +1
			} else {
				num = 1.0; // 해당맵에 스테이지(key) 값이 없었다면 value = 1
			}

			tmap.put(stage, num);

		}

		System.out.println("1단계" + tmap.toString()); // 스테이지에 해당하는 인원수 체크

		for (int i = 1; i <= N; i++) {

			double num;

			if (tmap.containsKey(i)) {
				num = tmap.get(i) / total / (1.0);  // 실패율 
				total = total - tmap.get(i); 
			} else {
				num = 0;
			}

			tmap.put(i, num);

		}

		System.out.println("2단계" + tmap.toString()); // 스테이지의 실패율로 map으로 저장

		
		// map을 Value 형태로 Sort 시키기
		
		List<Integer> keySetList = new ArrayList<Integer>(tmap.keySet());
		
		
		//람다식  (인자) -> (리턴값)  --> 오버라이딩하는것이 너무길기떄문에 간략하게 쓰는것이다 ( 자주사용하니 꼭 숙지! )
		
		/*
			기본적인 List는 sort 메소드를 사용하면되지만
			Map의 Value형태로 sort하려면 비교 메소드를 인자로받아
			그 메소드가 리턴한 값으로 소트한다.			
		*/
		
		Collections.sort(keySetList, (o1, o2) -> (tmap.get(o2).compareTo(tmap.get(o1))));
		
		for(int i=0 ; i<keySetList.size() ; i++) {
			answer[i] = keySetList.get(i); // value로 정렬한 key값을 answer 배열에 대입
			System.out.println(keySetList.get(i));
		}
		
		//return answer;
				
		
	}	
}
