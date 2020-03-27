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
		 * ������ �����ϵ��� list���·� ����ش�.
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
				if (list1.get(i) == check) {  // �Ҿ������� ��ȣ�� üũ					
					for (int t = 0; t < list2.size(); t++) {
						if (check == list2.get(t)) {
							while (true) {
								if (list1.get(index1) == check) { // �Ҿ��������� ������ ��������� �����ϴٸ� �� �ش� �ε����� ����
									remover1.add(index1);									
									while (true) {
										if (list2.get(index2) == check) { // �Ҿ��������� ������ ��������� �����ϴٸ� �� �ش� �ε����� ����
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
					if (check > n) { // �ִ��ο�������
						result = false;
					} else {
						result = true;
					}					
					
				}
			}			
		} 
		
		/*
		 * ������ ���� �ε������� �̿��ؼ� �����۾�
		 */
		for(int i=0; i<remover1.size() ; i++) {
			int rm = remover1.get(i);
			list1.remove(rm-i);
		}
		
		for(int i=0; i<remover2.size() ; i++) {
			int rm = remover2.get(i);
			list2.remove(rm-i);
		}		
		
		//�ʱ�ȭ
		index1 = 0;
		index2 = 0;
		check = 1;
		remover1.clear();
		remover2.clear();
				
		System.out.println("1��°�۾� ���»������Ʈ"+list1.toString());
		System.out.println("1��°�۾� ���и���Ʈ"+list2.toString());
		//���� ������ ������ �ְ� ���� �Ҿ������� ��������
		
		/*
		 * ���� ���Ϲ������ �����Ѵ�.. 
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
		//�ʱ�ȭ
		index1 = 0;
		index2 = 0;
		check = 1;
		remover1.clear();
		remover2.clear();
		
		System.out.println("2��°�۾� ���»������Ʈ"+list1.toString());
		System.out.println("2�����۾� ���и���Ʈ"+list2.toString());
		//���ʸ��������ش�
		
		
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
		
		System.out.println("3��°�۾� ���»������Ʈ"+list1.toString());
		System.out.println("3�����۾� ���и���Ʈ"+list2.toString());		
		//���ʺ����ش�.
		
		//�۾���..
		
		int count = n-list1.size();
		
		System.out.println("ü�����ִ»��" +count+"��");
		

	}

}
