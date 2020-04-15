package april;

public class Stock {

	public static void main(String[] args) {
		/*
		 *   https://programmers.co.kr/learn/courses/30/lessons/42584
		 */				
		int[] prices = { 1, 2, 3, 2, 3 };
		int[] answer = new int[prices.length];
		int count = 0;

		for (int i = 0; i < prices.length - 1; i++) {
			for (int j = i + 1; j < prices.length; j++) {

				if (prices[i] <= prices[j]) {
					count++;
				} else {
					count++;
					break;
				}
			}
			answer[i] = count;
			count = 0;
		}
		answer[prices.length - 1] = 0;		
	}
}
