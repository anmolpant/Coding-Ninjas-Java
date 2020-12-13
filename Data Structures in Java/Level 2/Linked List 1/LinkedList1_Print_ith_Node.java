package LinkedList;

public class LinkedList1_Print_ith_Node {
	
	public static void printIthNode(LinkedListNode<Integer> head, int i){
		//Your code goes here
        
        int count = 0;
        int ans = 0;
        
        if (head==null){
             System.out.println();
            return;
        }
        
        LinkedListNode<Integer> temp = head;
        while(temp.next != null){
            count++;
            temp = temp.next;
            if (count==i){
            	System.out.println(temp.data);
            }
        }
         
	}

}
