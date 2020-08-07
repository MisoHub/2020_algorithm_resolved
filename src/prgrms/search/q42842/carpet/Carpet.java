package prgrms.search.q42842.carpet;

import java.util.Arrays;

public class Carpet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int brown=10,yellow=2;
		int brown=8,yellow=1;
//		int brown=24,yellow=24;
		
		Arrays.stream(Carpet.solution(brown, yellow)).forEach(i -> System.out.print(i));
		
	}

    static public int[] solution(int brown, int yellow) {
    	int[] answer = new int[2];
    	
    	for(int i=1; i<=Math.sqrt(yellow);i++) {
    		// brown_n = (yellow_x+2) * (yellow_y+2) - yellow_n
    		if(yellow%i==0) {
    			if(brown == ((i+2) * (yellow/i+2) - yellow )) {
    				answer[0] = yellow/i+2;
    				answer[1] = i+2;
    			}
    		}
    	}
    	return answer;
    }
}
