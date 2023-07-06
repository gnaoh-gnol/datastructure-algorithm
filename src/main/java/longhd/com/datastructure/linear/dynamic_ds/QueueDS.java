package longhd.com.datastructure.linear.dynamic_ds;

/**
 * Queue is called an abstract data structure.
 * Data is always added to one end (enqueued), and removed from the other (dequeue).
 * Queue uses the First-In-First-Out approach and data item that was stored initially will be accessed first in queue.
 * The PriorityQueue and LinkedList are the most common classes used for queues.
 * - Feature of Queue:
 *      + Linear Data structure.
 *      + Follows FIFO.
 *      + Major operations:
 *          _ enqueue(element): Add an element to the end of the queue.
 *          _ dequeue(): Remove an element from the front of the queue.
 *          _ IsEmpty: Check if the queue is empty.
 *          _ IsFull: Check if the queue is full.
 *          _ Peek: Get the value of the front of the queue without removing it
 *      + All operation works in constant time.
 * - Advantages:
 *      + Maintains data in FIFO manner.
 *      + Insertion from beginning and deletion from end takes O(1) time.
 * - Disadvantages:
 *      + Limited functionality compared to more specialized queue implementations, such as PriorityQueue.
 * - When to use:
 *      + when we need a collection that follow FIFO order.
 *      + It is useful for tasks or requests in a multithreaded environment,
 *      scheduling jobs, or implementing breadth-first search algorithms.
 */
public class QueueDS {

    /**
     * Implement queue using array.
     */
    public static class QueueArray {
        private int front;
        private int rear;
        private int[] arr;
        QueueArray(int queueSize) {
            this.front = this.rear = -1;
            arr = new int[queueSize];
        }

        public void enqueue(int data) {
            if (rear == arr.length -1) {
                System.out.println("Queue Overflow\n Program Terminated \n");
                System.exit(-1);
            } else {
                arr[++rear] = data;
            }
            if (front == -1) {
                front++;
            }
        }

        public int dequeue() {
            int data = -1;
            if (front == -1) {
                System.out.println("Queue Overflow\n Program Terminated \n");
                System.exit(-1);
            } else {
                data = arr[front++];
            }
            if (rear == 0) {
                rear--;
            }
            return data;
        }

        public void displayQueue() {
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Singly Linked List
     */
    public static class LLNode {
        int data;
        LLNode next;
        LLNode(int data) {
            this.data = data;
        }
    }

    /**
     * Implement queue using array.
     */
    public static class QueueLL {
        public LLNode enqueue(LLNode head, int data) {
            LLNode tmpNode = new LLNode(data);
            if (head == null) {
                head = tmpNode;
            } else {
                LLNode tempHead = head;
                while (tempHead.next != null) {
                    tempHead = tempHead.next;
                }
                tempHead.next = tmpNode;
            }
            return head;

        }
        public LLNode dequeue(LLNode head) {
            if (head == null) {
                System.out.println("Queue Overflow\n Program Terminated \n");
                System.exit(-1);
            } else {
                head = head.next;
            }
            return head;
        }

        public void displayQueue(LLNode head) {
            if (head == null) {
                System.out.println("Queue Empty.");
                return;
            }
            LLNode tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data + " ");
                tmp = tmp.next;
            }
            System.out.println();
        }
    }

    /**
     * Demo.
     */
    public static void main(String[] args) {

        System.out.println("Example implement queue using Array");
        QueueArray queueArray = new QueueArray(10);
        queueArray.enqueue(1);
        queueArray.enqueue(2);
        queueArray.enqueue(3);
        queueArray.enqueue(4);
        queueArray.enqueue(5);
        queueArray.displayQueue();
        queueArray.dequeue();
        queueArray.displayQueue();

        System.out.println("Example implement queue using LinkedList");
        QueueLL queueLL = new QueueLL();
        LLNode head = null;
        head = queueLL.enqueue(null,1);
        head = queueLL.enqueue(head,2);
        head = queueLL.enqueue(head,3);
        head = queueLL.enqueue(head,4);
        head = queueLL.enqueue(head,5);
        queueLL.displayQueue(head);
        head = queueLL.dequeue(head);
        queueLL.displayQueue(head);
    }

}
