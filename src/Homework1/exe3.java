package Homework1;

public class exe3 {
	private int findMaxNum(int a[]){
		return a[findMaxNumIndex(a,a.length)];
	}
	
	private int findMaxNumIndex(int a[],int len){
		if(len == 1)  return len-1;
		else{
			int lastIndex = findMaxNumIndex(a,len-1);
			return a[lastIndex] > a[len-1]? lastIndex:len-1;
		}
		
	}
	
	private double findMeanOfArray(int a[]){
		int len = a.length;
		return (double)findSumOfArray(a, len)/len;
	}
	
	private int findSumOfArray(int a[],int len){
		if(len==0) return 0;
		else return findSumOfArray(a,len-1)+a[len-1];

	}
	
	
	
	public static void main(String[] args) {
		exe3 exe  = new exe3();
		int a[] = {2,0,4,8,0,8,6};
		System.out.println(exe.findMaxNum(a));
		System.out.println(exe.findMeanOfArray(a));
	}
}
