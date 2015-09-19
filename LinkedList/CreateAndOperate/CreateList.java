
public class CreateList {
	
	public class Node{
		int data;
		Node next;
		
		public Node(int val){
			this.data = val;
			this.next=null;
		}
		
	}
	public Node first=null;

	private void insert(){
		int [] arr = {2,3,4,5,6,7,8,9};
		Node cur=null;
		for(int i=0;i<arr.length;i++){
			if(cur==null){
				cur=new Node(arr[i]);
				this.first=cur;
			}
			else{
				Node temp= new Node(arr[i]);
				cur.next = temp;
				cur=cur.next;
			}
		}
	}
	private void reverse(Node first){
		if(first == null){
			return;
		}

		
		Node cur=first;
		Node prev =null;
		Node temp;
		while(cur !=null){
			temp=cur.next;
			cur.next=prev;
			prev=cur;
			cur=temp;
		}
		this.first=prev;
		
		
	}
	private Node rev_rec(Node first){
		if(first==null){
			return first;
		}
		if(first.next==null){
			return first;
		}
		Node rest = rev_rec(first.next);
		first.next.next=first;
		first.next=null;
		return rest;
		
		
	}
	private void remove(Node first, int index){
		if(first==null){
			return;
		}
		if(index==1){
			this.first=first.next;
			return;
		}
		int count=1;
		Node cur=first.next;
		Node prev=first;
		Node temp;
		while(cur !=null && count<=index){
			count++;
			if(count==index){
				prev.next=cur.next;
				return;
			}else{
				prev=cur;
				cur=cur.next;
			}
			
		}
		if(cur==null){
			System.out.println("Invalid Entry !");
		}
		
	}
	private void findKthLast(int k){
		if(first==null){
			return;
		}
		Node cur=first;
		Node prev=first;
		Node temp=first;
		int count=1;
		while(cur!=null && count<=k){
			cur=cur.next;
			count++;	
		}
		if(cur==null){
			System.out.println("Invalid k value !");
			return;
		}
		while(cur!=null){
			//temp=prev;
			prev=prev.next;
			cur=cur.next;
		}
		System.out.println("kth last: "+ prev.data);
		//temp.next=prev.next;
	}
	
	private void print(){
		//System.out.println("\nContent printing");
		Node cur = this.first;
		while(cur!=null){
			System.out.print(" => "+cur.data);
			cur=cur.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CreateList ll = new CreateList();
		ll.insert();
		System.out.println("Original list is: ");
		ll.print();
		System.out.println("Reversed list is: ");
		ll.reverse(ll.first);
		ll.print();
		System.out.println("After recursize reverse: ");
		ll.first = ll.rev_rec(ll.first);
		ll.print();
		System.out.println("After removing 5th element: ");
		ll.remove(ll.first, 5);
		ll.print();
		System.out.println("Displaying 3rd element from last: ");
		ll.findKthLast(3);
		System.out.println("Final list is: ");
		ll.print();
	}

}
