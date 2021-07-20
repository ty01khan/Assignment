/**
 * @author Talha Yaseen
 *
 * this class implements
 *   concatenate() method to concatenate 2 linked lists into one
 */
public class ListConcatenate {
    /**
     *
     * @param head1 : reference to the head node of first linked list
     * @param head2 : reference to the head node of second linked list
     * @return : reference to the head node of first linked list
     */
    public static Node concatenate(Node head1, Node head2) {
       if(head1 == null) {
            return head2;
       }
        if(head2 == null) {
            return head1;
        }

        Node temp = head1;
        while(temp.next != null) {
            temp = temp.next;
        }

        temp.next = head2;

        return head1;
    }

    public static void main(String[] args) {
        LL ll1 = new LL();
        LL ll2 = new LL();

        ll1.insert('a');
        ll1.insert('b');
        ll1.insert('c');

        System.out.print("Element of Linked List-are: ");
        ll1.printList();

        ll2.insert('e');
        ll2.insert('f');
        ll2.insert('g');
        ll2.insert('h');

        System.out.print("Element of Linked List-2 are: ");
        ll2.printList();
        System.out.println();

        Node head1 = ll1.getHead();
        Node head2 = ll2.getHead();

        head1 = concatenate(head1, head2);

        System.out.print("Element of Linked List-1 after concatenation are: ");
        ll1.printList();
    }
}
