package Practice1;



public class exe1 {
		private void permutationNum(int n, int r){	 
		   int[] store = new int[r];
		   printPermutationNum(store, n, r, 0);
		}
		
		private void printPermutationNum(int[] store, int cur , int r,int cnt){
			if(cnt == r ) {
				for (int i = 0; i < store.length; i++) {
					System.out.print(store[i]+" ");
				}
				System.out.println();
			}
			else{
				for (int i = cur; i >= r-cnt; i--) {
					store[cnt] = i;
					printPermutationNum(store, i-1, r, cnt+1);
				}
			}
		}
		
		
		public static void main(String[] args) {
			exe1 exe = new exe1();
			exe.permutationNum(5, 3);
		}
}
