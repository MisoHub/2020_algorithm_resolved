package prgrms.kakao2020.q60058.changebrk;

public class ChangeBracket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String p =
//				"(()())()";
//				")(";
				"()))((()";
		System.out.println(new ChangeBracket().solution(p));
		
	}
	
    public String solution(String p) {
                        
        return orderString(p);
    }
    
    
    public String orderString(String input) {
    	if(input.length()==0)
    		return "";
    	char[] carr = input.toCharArray();
    	int nBalance=0;
    	int cindex=0;
    	boolean isCorrect = true;
    	
    	// split u, v
    	for(char c : carr) {
    		nBalance = c=='('? nBalance+1:nBalance-1;
    		cindex+=1;
    		if(nBalance<0)
    			isCorrect = false;
    		if(nBalance==0)
    			break;
    	}
    	
    	String u = input.substring(0, cindex);
    	String v = input.substring(cindex,input.length());
    	
    	if(isCorrect)
    		return u+orderString(v);
    	else{
    		
    		u = u.substring(1,u.length()-1);
    		char[] cu = u.toCharArray();
    		for(int i=0;i<cu.length; i++) {
    			 cu[i] = cu[i]=='('?')':'(';
    		}
    		u = String.valueOf(cu);
    		
    		return "("+orderString(v)+")"+u;
    	}

    }
}
