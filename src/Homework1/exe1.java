package Homework1;

public class exe1 {
	private int numOfBinaryone(int n){
		if(n==1) return 1;
		return n%2==1? 1+numOfBinaryone(n/2):numOfBinaryone(n/2);
	}
	
	public static void main(String[] args) {
		exe1 exe = new exe1();
		System.out.println(exe.numOfBinaryone(16));
	}
}
