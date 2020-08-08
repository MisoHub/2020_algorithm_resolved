package prgrms.search.q42885.safetyboat;

import java.util.Arrays;
import java.util.LinkedList;

public class SafetyBoat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] people =
				// { 70, 50, 80, 50 };
				{ 70, 50, 80 };
		// { 10, 10, 10, 10, 10, 10 };
		int limit = 100;
		System.out.println(SafetyBoat.solution(people, limit));

	}

	static public int solution(int[] people, int limit) {
		int answer = 0;

		Arrays.sort(people);
		LinkedList<Integer> pList = new LinkedList<Integer>();
		Arrays.stream(people).forEach(i -> pList.add(i));

		while (!pList.isEmpty()) {

			if (pList.size() > 1 && limit >= pList.getLast() + pList.getFirst()) {
				pList.removeLast();
				pList.removeFirst();

			} else {
				pList.removeLast();
			}
			answer++;
		}

		return answer;
	}

}
