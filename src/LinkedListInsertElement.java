import java.util.*;
class Node1{
    int data;
    Node1 next;
    Node1(int data){
        this.data = data;
        this.next = null;
    }
}
public class LinkedListInsertElement {
    static Node1 head;
    LinkedListInsertElement(){head = null;}
public LinkedListInsertElement insert(LinkedListInsertElement li, int data){
        Node1 newNode = new Node1(data);
        if(head == null){
            head = newNode;
        }
        else{
            Node1 temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        return li;
}
public void display(LinkedListInsertElement li){
        Node1 temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    System.out.println();

}
    public static void main(String[] args) {
        LinkedListInsertElement li = new LinkedListInsertElement();
        li.insert(li, 1);
        li.display(li);
        li.insert(li, 2);
        li.display(li);
        li.insert(li, 3);
        li.display(li);
        li.insert(li, 4);


        li.display(li);
    }
}
