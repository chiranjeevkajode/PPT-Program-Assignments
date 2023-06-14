
//  **Question 2**

// Given a linked list of **N** nodes. The task is to check if the linked list has a loop. Linked list can contain self loop.


public class Question2 {
    static class Node {
        Node next;
    }
    private static boolean detectLoop(Node head){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast= fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
       
    }
    
}
