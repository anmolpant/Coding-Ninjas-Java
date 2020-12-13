package LinkedList;

public class LinkedList1_LengthOfLL {
	public static int length(LinkedListNode<Integer> head){
		//Your code goes here
        
        //head = null;
        
        if (head == null){
            return 0;
        }
        
        LinkedListNode<Integer> temp = head;
        int count = 1;
        while(temp.next!=null){
            count++;
            temp = temp.next;
        }
        return count;
	}

}
