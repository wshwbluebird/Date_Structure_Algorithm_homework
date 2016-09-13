package Homework1;

public class exe2 {
	public void permute( String str ){
		int len = str.length();
		permute(str.toCharArray(),0,len);
	}
	
	 private void permute( char [ ] str, int low, int high ){
		if(low==high) System.out.println(str);
		else{
			for(int i = low  ;i < high ;i++){
				char temp = str[low];
				str[low] = str[i];
				str[i] = temp;
				permute(str,low+1,high);
				temp = str[low];
				str[low] = str[i];
				str[i] = temp;
				}
		}
	} 
	 
	 public static void main(String[] args) {
		exe2 exe =new exe2();
		exe.permute("abcd");
	}
}
