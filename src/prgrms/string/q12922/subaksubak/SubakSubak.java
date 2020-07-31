package prgrms.string.q12922.subaksubak;

import java.util.Collections;

public class SubakSubak {
	
	static String sBase ="수박";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(SubakSubak.solution(10));
		System.out.println(SubakSubak.solution(3));
	}

	static public String solution(int n) {
		
		return n%2==0? String.join("",Collections.nCopies(n/2, sBase)) : String.join("",Collections.nCopies(n/2, sBase))+sBase.charAt(0);
    }
}

/***
 * 
 * String join 사용
 * 
 * join("추가할 문자", "대상 list") ----- String.join("", Collections.nCopies(n, s)); 
 * join("추가할 문자", "대상 Array") ---- String.join(",", Collections.nCopies(n, s)); 
 * stream에서 사용 -------------------- {arr_var}.stream.collect(Collectors.joining(","));
 * 
 */
