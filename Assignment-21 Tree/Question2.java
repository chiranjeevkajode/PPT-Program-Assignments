
class Node
{
    int data;
    Node left = null, right = null;
 
    Node(int data) {
        this.data = data;
    }
}

public class Question2 {
    public static void printDLL(Node head)
    {
        Node curr = head;
        while (curr != null)
        {
            System.out.print(curr.data + " ");
            curr = curr.right;
        }
    }
 
    
    public static Node convert(Node root, Node head)
    {
        if (root == null) {
            return head;
        }
 
        head = convert(root.left, head);
        root.left = null;
 
        Node right = root.right;
 
        root.right = head;
        if (head != null) {
            head.left = root;
        }
 
        head = root;
 
        return convert(right, head);
    }
 
    public static Node reverse(Node head)
    {
        Node prev = null;
        Node current = head;
 
        while (current != null)
        {
            Node temp = current.left;
            current.left = current.right;
            current.right = temp;
 
            prev = current;
            current = current.left;
        }
 
        return prev;
    }
 

    public static void convert(Node root)
    {
        Node head = null;
 
        head = convert(root, head);
 
        head = reverse(head);
 
        printDLL(head);
    }
 
    public static void main(String[] args)
    {
       
 
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(20);
        root.left.left = new Node(30);
        root.left.right = new Node(35);
 
        convert(root);
    }
}
