package prgrms.search.q42840.pretest;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PreTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] answers= {1,2,3,4,5};
		int[] answers= {1,3,2,4,2};
		Arrays.stream(PreTest.solution(answers)).forEach(i-> System.out.print(i));
	}

	static public int[] solution(int[] answers) {

		int[][] pattern = { { 1, 2, 3, 4, 5 }, { 2, 1, 2, 3, 2, 4, 2, 5 }, { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 } };
		int[] score = { 0, 0, 0 };

		for (int j = 0; j < pattern.length; j++) {
			int plen = pattern[j].length;
			for (int i = 0; i < answers.length; i++) {
				if (answers[i] == pattern[j][i % plen])
					score[j]++;
			}
		}
		int maxScore = Arrays.stream(score).max().getAsInt();
		return IntStream.range(0, 3).filter(i -> score[i] == maxScore).map(i -> i+1).toArray();
		
	}

}
