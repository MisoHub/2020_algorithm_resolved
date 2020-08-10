package prgrms.kakao2020.q60057.stringcomp;

public class StringComp {

	static public void main(String[] args) {
		String s = 
//				"aabbaccc";
//				"ababcdcdababcdcd";
//				"abcabcdede";
//				"abcabcabcabcdededededede";
//				"xababcdcdababcdcd";
				"aaaaaaaaaa";
		System.out.println(StringComp.solution(s));
	}

	static public int solution(String s) {
		int mlen = s.length();
		for (int i = 1; i <= s.length() / 2; i++) {
			StringBuilder sb = new StringBuilder(s);
			int cntComp = 1;
			int cntPoint= 1;
			int lenComp = sb.length();
			for (int j = 1; j < sb.length() / i; j++) {
				if (sb.substring((j - 1) * i, j * i).contentEquals(sb.substring(j * i, (j + 1) * i))) { // same
					cntComp++;
					cntPoint = String.valueOf(cntComp).length();
					// 조건이 1000개라.. 이쁘진 않네 
					// 자리수 구할때 Math.log10()+1 사용 
					lenComp = (cntComp == 2) || (cntComp == 10) || (cntComp == 100) || (cntComp == 1000)? lenComp - i + 1 : lenComp - i;
				} else { // diff
					cntComp = 1;
				}
			}
			if (lenComp < mlen)
				mlen = lenComp;
		}
		return mlen;
	}
}
