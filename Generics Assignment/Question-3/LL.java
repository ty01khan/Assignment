/**
 * @author Talha Yaseen
 *
 * this is a user defined LinkedList class that implements
 *   insert() method to insert a node in a linked list
 *   getHead() method to get the head node of a linked list
 *   printList() method to print all the element of a linked list
 */
public class LL {
    Node head = null;

    public Node getHead() {
        return head;
    }

    public void insert(char data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;

        if(head == null) {
            head = newNode;
        }
        else {
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void printList() {
        Node node = head;

        while(node.next != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println(node.data);
    }
}
