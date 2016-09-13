package Practice1;


public class exe2_Hanoi {
		private void hanoiMove(int n , char source ,char aim, char mid){
			if(n==1)  System.out.println(String.format("Move Disk No.%d  from %c to %c", n,source,aim));
			else{
				hanoiMove(n-1, source, mid, aim);
				System.out.println(String.format("Move Disk No.%d  from %c to %c", n,source,aim));
				hanoiMove(n-1, mid, aim, source);
			}
		}
		
		
		public static void main(String[] args) {
			exe2_Hanoi exe =new exe2_Hanoi();
			exe.hanoiMove(3, 'A', 'C', 'B');
		}
}
