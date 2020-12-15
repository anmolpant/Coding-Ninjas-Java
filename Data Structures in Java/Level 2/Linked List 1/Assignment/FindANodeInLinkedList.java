package LinkedList;


/*

Following is the Node class already written for the Linked List

class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;

	public LinkedListNode(T data) {
    	this.data = data;
	}
}

*/

public class public class FindANodeInLinkedList {

public static int findNode(LinkedListNode<Integer> head, int n) {
	//Your code goes here
    
    int ans = 0;
    int count = 0;
    
    while(head!=null){
        count++;
        if (head.data == n){
            ans = count;
        }
        head = head.next;
    }
    
    return ans-1;
	}
}


