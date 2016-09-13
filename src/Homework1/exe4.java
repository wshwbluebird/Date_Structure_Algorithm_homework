package Homework1;

public class exe4 {
	
	class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) { val = x;}
	}
	
	private int depthOfLinklist(ListNode cur){
		if(cur == null ) return 0;
		else return 1+depthOfLinklist(cur.next);
	}
	
	
	public static void main(String[] args) {
		exe4 exe = new exe4();
		ListNode n1 = exe.new ListNode(0);
		ListNode pp = n1;
		for (int i = 1; i < 10; i++) {
			ListNode temp = exe.new ListNode(i);
			pp.next = temp;
			pp = pp.next;
		}
		
		System.out.println(exe.depthOfLinklist(n1));
	}
	
	
}
