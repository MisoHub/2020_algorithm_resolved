package prgrms.string.q12925.string2int;

public class String2Int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(String2Int.solution("-325235"));
		System.out.println(String2Int.solution("+11325235"));
		System.out.println(String2Int.solution("0325235"));
		System.out.println(String2Int.solution("-0325235"));
	}

	static public int solution(String s) {
		return Integer.parseInt(s);
	}
}
