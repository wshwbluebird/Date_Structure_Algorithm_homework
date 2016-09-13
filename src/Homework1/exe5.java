package Homework1;

public class exe5 {
	private boolean checkPalindromesWord(String str){
		return checkWord(str.toCharArray(), 0, str.length()-1);
	}
	private boolean checkWord(char[] str,int left ,int right){
		if(left >= right)  return true;
		return str[left]==str[right]? checkWord(str, left+1, right-1):false;
	}
	
	private boolean checkPalindromesSentence(String str){
		return checkSentence(str.toLowerCase().toCharArray(), 0, str.length()-1);
	}
	private boolean checkSentence(char[] str,int left ,int right){
		if(left >= right)  return true;
		if(str[left]>'z'||str[left]<'a') return checkSentence(str, left+1, right);
		if(str[right]>'z'||str[right]<'a') return checkSentence(str, left, right-1);
		return str[left]==str[right]? checkSentence(str, left+1, right-1):false;
	}
	
	public static void main(String[] args) {
		exe5 exe = new exe5();
		System.out.println(exe.checkPalindromesWord("sdfdofds"));
		System.out.println(exe.checkPalindromesSentence("Madam, I' m Adam"));
		
	}
}
