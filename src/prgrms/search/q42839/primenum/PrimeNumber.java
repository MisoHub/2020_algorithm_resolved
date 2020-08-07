package prgrms.search.q42839.primenum;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String input="17";
		String input="0111111";
//		String input="3579";
//		String input="37";
		
		System.out.println(PrimeNumber.solution(input));
	}

	static public int solution(String numbers) {
		int answer = 0;
		char[] charArray = numbers.toCharArray();
		TreeSet<Integer> combSets = new TreeSet<Integer>();
		boolean[] nChecked = new boolean[charArray.length];

		// add all combination to sets
		for (int i = 0; i < charArray.length; i++) {
			nChecked[i]=true;
			addCombSets(charArray,combSets,""+charArray[i],nChecked,charArray.length);
			nChecked[i]=false;
		}
		
		// calc primnum 
		int[] combArray = combSets.stream().mapToInt(i -> i).toArray();
		for( int nTarget : combArray) {
			boolean isPrime = nTarget <= 1 ? false:true;
			for(int i=2; i<=Math.sqrt(nTarget);i++) {
				if(nTarget%i==0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime)
				answer++;
		}
		return answer;
	}

	static void addCombSets(char[] charArray, TreeSet<Integer> combSets, String sb, boolean[] nChecked, int n) {
		combSets.add(Integer.parseInt(sb));
		
		for (int i = 0; i < nChecked.length; i++) {
			if (nChecked[i] == false) {
				if (n > 0 ) {
					nChecked[i] = true;
					addCombSets(charArray, combSets, sb+charArray[i], nChecked, n - 1);
					nChecked[i] = false;
				}
			}
		}
	}

}
