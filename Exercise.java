package march;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise {

	public static void main(String[] args) {

		//https://programmers.co.kr/learn/courses/30/lessons/42862
		
		int n = 10;
		int[] lost = {1, 2, 3, 5, 7, 9, 10};
		int[] reserve = { 1, 2, 6, 7, 8 };		
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		List<Integer> remover1 = new ArrayList<Integer>();
		List<Integer> remover2 = new ArrayList<Integer>();
 
		int check = 1;
		int index1 = 0;
		int index2 = 0;
		boolean result = true;

		Arrays.sort(lost);
		Arrays.sort(reserve);

		/*
		 * 삭제가 용이하도록 list형태로 담아준다.
		 */
		for (int i = 0; i < lost.length; i++) {
			list1.add(lost[i]);
		}

		for (int i = 0; i < reserve.length; i++) {
			list2.add(reserve[i]);
		}		
		
		for (int i = 0; i < list1.size(); i++) {
			result = true;			
			while (result) {
				if (list1.get(i) == check) {  // 잃어버린사람 번호를 체크					
					for (int t = 0; t < list2.size(); t++) {
						if (check == list2.get(t)) {
							while (true) {
								if (list1.get(index1) == check) { // 잃어버린사람과 여분을 가진사람이 동일하다면 그 해당 인덱스를 저장
									remover1.add(index1);									
									while (true) {
										if (list2.get(index2) == check) { // 잃어버린사람과 여분을 가진사람이 동일하다면 그 해당 인덱스를 저장
											remover2.add(index2);											
											break;
										} else {
											index2++;
										}
									}
									break;
								} else {
									index1++;
								}
							}
						}						
					}					
					result = false;
				} else {			
					check++;					
					if (check > n) { // 최대인원수제한
						result = false;
					} else {
						result = true;
					}					
					
				}
			}			
		} 
		
		/*
		 * 위에서 구한 인덱스값을 이용해서 제거작업
		 */
		for(int i=0; i<remover1.size() ; i++) {
			int rm = remover1.get(i);
			list1.remove(rm-i);
		}
		
		for(int i=0; i<remover2.size() ; i++) {
			int rm = remover2.get(i);
			list2.remove(rm-i);
		}		
		
		//초기화
		index1 = 0;
		index2 = 0;
		check = 1;
		remover1.clear();
		remover2.clear();
				
		System.out.println("1번째작업 없는사람리스트"+list1.toString());
		System.out.println("1번째작업 여분리스트"+list2.toString());
		//내가 여분을 가지고 있고 내가 잃어버린경우 먼저제외
		
		/*
		 * 위와 동일방법으로 실행한다.. 
		 */
		for (int i = 0; i < list1.size(); i++) {
			result = true;
			while (result) {
				if (list1.get(i) == check) {
					for (int t = 0; t < list2.size(); t++) {
						if (check+1 == list2.get(t)) {
							while (true) {
								if (list1.get(index1) == check) {
									remover1.add(index1);
									while (true) {
										if (list2.get(index2) == check+1) {
											remover2.add(index2);
											break;
										} else {
											index2++;
										}
									}
									break;
								} else {
									index1++;
								}
							}
						}
					}
					result = false;
				} else {
					check++;
					if (check > n) {
						result = false;
					} else {
						result = true;
					}
				}
			}
		} 
		
		for(int i=0; i<remover1.size() ; i++) {
			int rm = remover1.get(i);
			list1.remove(rm-i);
		}
		
		for(int i=0; i<remover2.size() ; i++) {
			int rm = remover2.get(i);
			list2.remove(rm-i);
		}		
		//초기화
		index1 = 0;
		index2 = 0;
		check = 1;
		remover1.clear();
		remover2.clear();
		
		System.out.println("2번째작업 없는사람리스트"+list1.toString());
		System.out.println("2번쨰작업 여분리스트"+list2.toString());
		//앞쪽먼저빌려준다
		
		
		for (int i = 0; i < list1.size(); i++) {
			result = true;
			while (result) {
				if (list1.get(i) == check) {
					for (int t = 0; t < list2.size(); t++) {
						if (check-1 == list2.get(t)) {
							while (true) {
								if (list1.get(index1) == check) {
									remover1.add(index1);
									while (true) {
										if (list2.get(index2) == check-1) {
											remover2.add(index2);
											break;
										} else {
											index2++;
										}
									}
									break;
								} else {
									index1++;
								}
							}
						}
					}
					result = false;
				} else {
					check++;
					if (check > n) {
						result = false;
					} else {
						result = true;
					}
				}
			}
		} 
		
		for(int i=0; i<remover1.size() ; i++) {
			int rm = remover1.get(i);
			list1.remove(rm-i);
		}
		
		for(int i=0; i<remover2.size() ; i++) {
			int rm = remover2.get(i);
			list2.remove(rm-i);
		}		
		
		System.out.println("3번째작업 없는사람리스트"+list1.toString());
		System.out.println("3번쨰작업 여분리스트"+list2.toString());		
		//뒤쪽빌려준다.
		
		//작업끝..
		
		int count = n-list1.size();
		
		System.out.println("체육복있는사람" +count+"명");
		

	}

}
