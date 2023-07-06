package longhd.com.datastructure.linear.dynamic_ds;

public class LinkedListDS {
    /**
     * Linked List data structure helps the required objects to be arranged in a linear order.
     * - Advantages:
     *      + Unlikely an array, LinkedList does not require contiguous memory and, and it can use whatever memory is available.
     *      + It is dynamic size, so it doesn't waste any capacity.
     *      + You can easily insert and delete new elements as you need and the memory allocation for a LinkedList
     *      is much more efficient than with array.
     * - Disadvantages:
     *      + You cannot access elements at random, so you must work around the order of elements with this.
     *      + Just remember, you're giving up random access with can cause problems.
     *      + The "head node" (Generally the first element in the list) is the key, and you'll lose the entire list
     *      if you lose that.
     * - When to use:
     *      + Suitable where memory is limited.
     *      + Suitable for applications that require frequent insertion and deletion.
     * - Type of LinkedList:
     *      + Singly Linked List (Uni-Directional).
     *      + Doubly Linked List (Bi-Directional).
     *      + Circular Linked List.
     */

    public class SinglyLinkedListNode {
        private int data;
        private SinglyLinkedListNode next;
        SinglyLinkedListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }



    public class DoublyLinkedListNode {
        private int data;
        private DoublyLinkedListNode next;
        private DoublyLinkedListNode previous;
        private
        DoublyLinkedListNode(int data) {
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }

    // Circular Linked List for Singly Linked List
    private class CircularLinkedListForSinglyLinkedList {
        public SinglyLinkedListNode head = null;
        public SinglyLinkedListNode tail = null;
        public void addNode(int element) {
            SinglyLinkedListNode newNode = new SinglyLinkedListNode(element);
            if (head == null) {
                head = newNode;
                tail = newNode;
                newNode.next = head;
            } else {
                tail.next = newNode;
                tail = newNode;
                tail.next = head;
            }
        }
    }
}
