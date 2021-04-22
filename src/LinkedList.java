
public class LinkedList {
	int data;
	LinkedList next;
	
	
	static LinkedList start;
	static LinkedList end;
	
	protected LinkedList(int data,LinkedList next ){
		this.data = data;
		this.next = next;
		
		if(start == null) {
			start = this;
			end = this;
		}else {
			end.next = this;
			end = this;
			
		}
			
	}
	
	public static void print() {
		LinkedList node = start;
		
		do {
			System.out.println(node.data);
			node = node.next;
		}while(node!=null);
		
	}
	

	
}
