package april;

public class PassWord {

	public static void main(String[] args) {
				
		String s = "aBz";		
		int n = 4;
		
		String answer = "";
		
		int slen = s.length();
		char onechar;
		char start;
		
		for(int i=0 ; i<slen ; i++) {
			onechar = s.charAt(i);			
			if(onechar != ' ') {
				start = Character.isLowerCase(onechar) ? 'a' : 'A';
				onechar = (char)(start + (onechar+n-start)%26);				
			}
			
			answer += onechar;
			
		}
		
		System.out.println(answer);
		

	}

}
