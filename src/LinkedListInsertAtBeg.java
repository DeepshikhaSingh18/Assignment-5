class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class LinkedListInsertAtBeg {
    static Node head;
    LinkedListInsertAtBeg(){head = null;}
    public static Node insert(LinkedListInsertAtBeg li, int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return head;
    }
    public void display(){
        Node node = head;
        while(node != null){
            System.out.print(node.data+ " ");
            node=node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedListInsertAtBeg ll = new LinkedListInsertAtBeg();
        ll.insert(ll,6);
        ll.insert(ll,1);
        ll.insert(ll,2);
        ll.insert(ll,3);
        ll.insert(ll,9);

        ll.display();


    }
}
