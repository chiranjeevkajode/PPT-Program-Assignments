
//  **Question 1**

// Given a singly linked list, delete **middle** of the linked list. For example, if given linked list is 1->2->**3**->4->5 then linked list should be modified to 1->2->4->5.If there are **even** nodes, then there would be **two middle** nodes, we need to delete the second middle element. For example, if given linked list is 1->2->3->4->5->6 then it should be modified to 1->2->3->5->6.If the input linked list is NULL or has 1 node, then it should return NULL


public class Question1 {
    static class Node {
        int data;
        Node next;
    }
  
    static Node newNode(int data)
    {
        Node temp = new Node();
        temp.data = data;
        temp.next = null;
        return temp;
    }
  
    static int countOfNodes(Node head)
    {
        int count = 0;
        while (head != null) {
            head = head.next;
            count++;
        }
        return count;
    }
  
    static Node deleteMid(Node head)
    {
        if (head == null)
            return null;
        if (head.next == null) {
            return null;
        }
        Node copyHead = head;
  
        int count = countOfNodes(head);
  
        int mid = count / 2;
  
        while (mid-- > 1) {
            head = head.next;
        }
  
        head.next = head.next.next;
  
        return copyHead;
    }
  
    static void printList(Node ptr)
    {
        while (ptr != null) {
            System.out.print(ptr.data + "->");
            ptr = ptr.next;
        }
        
    }
  
    public static void main(String[] args)
    {
        Node head = newNode(1);
        head.next = newNode(2);
        head.next.next = newNode(3);
        head.next.next.next = newNode(4);
        head.next.next.next.next = newNode(5);
  
  
        head = deleteMid(head);
  
      
        printList(head);
    }
}