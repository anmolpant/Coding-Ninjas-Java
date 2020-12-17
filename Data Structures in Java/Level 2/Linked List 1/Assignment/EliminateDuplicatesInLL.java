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


public class EliminateDuplicatesInLL {

public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
	//Your code goes here
    
    if (head==null || head.next==null){
        return head;
    }
    
    //make pivot at head
    
    LinkedListNode<Integer> pivot1=head;
    
    //check for eol
    while(pivot1.next!=null){
        //compare
        if(pivot1.data.equals(pivot1.next.data)){
            pivot1.next = pivot1.next.next;
        }
        else{
            pivot1 = pivot1.next;
        }
    }
    
    return head;
}

}
