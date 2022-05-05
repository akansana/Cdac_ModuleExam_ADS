class ReverseLL{
	
	static Node head;
	
	static class Node{
		
		int data;
		Node next;
		
	 Node(int data){
		 this.data = data;
		 this.next = null;
	    }
	}
	
	Node reverse(Node node){
		Node prev = null;
		Node current = node;
		Node next = null;
		
		while(current != null){
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		
		node = prev;
		return node;
	}
	
     void printList(Node node){
		while(node !=null){
			System.out.println(node.data);
			node = node.next;
		}
	}
    public static void main(String... args){
      
	  ReverseLL l1 = new ReverseLL();
	  l1.head = new Node(1);
	  l1.head.next = new Node(2);
	  l1.head.next.next = new Node(3);
	  l1.head.next.next = new Node(4);
	  l1.head.next.next.next = new Node(5);
	  
	  System.out.println("Linked list that to be reversed");
	  l1.printList(head);
	  head = l1.reverse(head);
	  
	  System.out.println("Linked list after Reverse");
	  l1.printList(head);
	
	
	}
}