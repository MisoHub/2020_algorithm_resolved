package prgrms.stack.q42584.stockprice;

import java.util.Arrays;

public class StockPrice {

	static public void main(String[] args) {

		int[] prices = {1,2,3,2,3};
		Arrays.stream(StockPrice.solution(prices)).forEach(i -> System.out.print(i));
	}

	static public int[] solution(int[] prices) {
		int[] answer = new int[prices.length];

		for (int i = 0; i < prices.length; i++) {
			
			if (i == (prices.length - 1)) {
				answer[i] = 0;
				break;
			}

			answer[i] = prices.length - 1 - i;
			for (int j = i+1; j < prices.length; j++) {
				if(prices[i]>prices[j]) {
					answer[i] = j - i;
					break;
				}
			}
		}
		return answer;
	}

}
