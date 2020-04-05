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

		int N = 5; // ���������� ����
		int[] stages = { 2, 1, 2, 6, 2, 4, 3, 3 }; // �������� ��������	
		
		int[] answer = new int[N];

		double total = stages.length;

		Map<Integer, Double> tmap = new TreeMap<Integer, Double>();

		for (int i = 0; i < stages.length; i++) {

			int stage = stages[i];
			Double num;

			if (stage > N)
				continue;

			if (tmap.containsKey(stage)) {
				num = tmap.get(stage) + 1.0;  // �ش�ʿ� ���������� �־��ٸ� value +1
			} else {
				num = 1.0; // �ش�ʿ� ��������(key) ���� �����ٸ� value = 1
			}

			tmap.put(stage, num);

		}

		System.out.println("1�ܰ�" + tmap.toString()); // ���������� �ش��ϴ� �ο��� üũ

		for (int i = 1; i <= N; i++) {

			double num;

			if (tmap.containsKey(i)) {
				num = tmap.get(i) / total / (1.0);  // ������ 
				total = total - tmap.get(i); 
			} else {
				num = 0;
			}

			tmap.put(i, num);

		}

		System.out.println("2�ܰ�" + tmap.toString()); // ���������� �������� map���� ����

		
		// map�� Value ���·� Sort ��Ű��
		
		List<Integer> keySetList = new ArrayList<Integer>(tmap.keySet());
		
		
		//���ٽ�  (����) -> (���ϰ�)  --> �������̵��ϴ°��� �ʹ���⋚���� �����ϰ� ���°��̴� ( ���ֻ���ϴ� �� ����! )
		
		/*
			�⺻���� List�� sort �޼ҵ带 ����ϸ������
			Map�� Value���·� sort�Ϸ��� �� �޼ҵ带 ���ڷι޾�
			�� �޼ҵ尡 ������ ������ ��Ʈ�Ѵ�.			
		*/
		
		Collections.sort(keySetList, (o1, o2) -> (tmap.get(o2).compareTo(tmap.get(o1))));
		
		for(int i=0 ; i<keySetList.size() ; i++) {
			answer[i] = keySetList.get(i); // value�� ������ key���� answer �迭�� ����
			System.out.println(keySetList.get(i));
		}
		
		//return answer;
				
		
	}	
}
