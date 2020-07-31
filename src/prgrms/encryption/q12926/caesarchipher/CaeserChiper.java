package prgrms.encryption.q12926.caesarchipher;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CaeserChiper {
	static Character[] cBase = Stream.iterate('a', c -> (char)(c+1) ).limit(26).toArray(Character[]::new);
	static public void main(String[] args) {
		System.out.println(CaeserChiper.solution("AB", 1));
		System.out.println(CaeserChiper.solution("z", 1));
		System.out.println(CaeserChiper.solution("a B z", 4));
	}
	
    static public String solution(String s, int n) {
        
        return s.chars().map(i -> {
        	if(i==' ')
        		return i;
        	else if(Character.isUpperCase(i)) 
        		return Character.toUpperCase(cBase[(Character.toLowerCase(i)-'a'+n)%26]);
        	else 
        		return cBase[(Character.toLowerCase(i)-'a'+n)%26]; 
        	}
        ).mapToObj(i -> (char)i).collect(StringBuilder::new,StringBuilder::appendCodePoint, StringBuilder::append).toString();
    }
	
}

/***
 * 
 * Stream Collect 
 * 
 * Stream을 Array로 바꾸는 방법 ---- stream.toArray(Character[]::new) ---- toArray 후 안에서 생성자 사용 (primitive 타입 안됨)
 * stream을 String으로 변환 ------ stream.collect(T, A-accumulator, R)
 * stream을 List로 변환  --------- stream.collect(Collections.toList());
 * 
 */
