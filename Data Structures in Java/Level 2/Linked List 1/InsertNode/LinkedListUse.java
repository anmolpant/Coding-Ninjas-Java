import java.util.Scanner;

public class LinkedListUse {
	
	public static Node<Integer> takeInput()
	{
		Node<Integer> head = null, tail = null;
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
				
		while(data != -1){
			Node<Integer> newNode = new Node<Integer>(data);
			if(head == null){
				head = newNode;
				tail = newNode;
			}else{
//				Node<Integer> temp = head;
//				while(temp.next != null){
//					temp = temp.next;
//				}
//				temp.next = newNode;
				tail.next = newNode;
				tail = newNode; // tail = tail.next
			}
			data = s.nextInt();
		}
		return head;
	}
	
	public static void print(Node<Integer> head){
		
		while(head != null){
			System.out.print(head.data +" ");
			head = head.next;
		}
		System.out.println();

	}

	public static Node<Integer> insert(Node<Integer> head, int data, int pos){
		Node<Integer> newNode = new Node<Integer>(data);
		if(pos == 0){
			newNode.next = head;
			return newNode;
		}
		int i = 0;
		Node<Integer> temp = head;
		while(i < pos - 1){
			temp = temp.next;
			i++;
		}
		newNode.next = temp.next;
		temp.next = newNode;
		return head;
	}
	
	public static void main(String[] args) {
		
		Node<Integer> head = takeInput();
		head = insert(head, 80, 0);
		print(head);
		
//		Node<Integer> node1 = new Node<Integer>(10);
//		Node<Integer> node2 = new Node<Integer>(20);
//		Node<Integer> node3 = new Node<Integer>(30);
//		node1.next = node2;
//		node2.next = node3;
//		Node<Integer> head = node1;
//		print(head);
//		print(head);
		

	}

}
