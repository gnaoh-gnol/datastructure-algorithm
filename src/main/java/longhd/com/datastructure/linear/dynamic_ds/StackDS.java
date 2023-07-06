package longhd.com.datastructure.linear.dynamic_ds;

import java.util.Stack;

public class StackDS {
    /**
     * Stack is representation of nodes. There are two components to each node: data and next (storing address of next node)
     * Each node's data portion contains the assigned value and its next pointer directs the user to the node that
     * has stack's subsequent item. The highest node in the stack is referred to as the top.
     * - Features of Stack:
     *      + Linear Data Structures using Java.
     *      + Follows LIFO: Last In First Out.
     *      + Only the top elements are available to be accessed.
     *      + Insertion and deletion takes place from the top.
     *      + 4 major operations:
     *          _ push(element) - used to insert element at top.
     *          _ pop() - removes the top element from stack.
     *          _ isEmpty() - returns true if stack is empty.
     *          _ peek() - to get the top element of the stack.
     *      + All operation in stack works in constant time.
     * - Advantages:
     *      + Provides LIFO behavior, suitable for specific algorithms and data processing tasks.
     *      + Offers basic stack operations.
     *      + All operations are of O(1) complexity.
     * - Disadvantages:
     *      + Manipulation is restricted to the top of the stack.
     *      + Not much flexible.
     * - When to use: Stack useful for tasks like: evaluating expressions, backtracking algorithms or maintain undo/redo.
     */

    /**
     * Stack using Array
     */
    public static class Stack {
        private int arr[];
        private int top;
        private int capacity;
        Stack(int size) {
            arr = new int[size];
            capacity = size;
            top = -1;
        }

        /**
         * Function to add an element `x` to the stack.
         */
        public void push(int x) {
            if (isFull()) {
                System.out.println("StackOverflow\n Program Terminated \n");
                System.exit(-1);
            }
            System.out.println("Inserting: " + x);
            arr[++top] = x;
        }

        /**
         * Function to pop a top element from stack.
         */
        public int pop() {
            if(isEmpty()) {
                System.out.println("StackOverflow\n Program Terminated \n");
                System.exit(-1);
            }
            System.out.println("Removing: " + peek());
            // decrease stack size by 1 and optionally return the top element of the stack
            return arr[top--];
        }

        /**
         * Function to return the top element of the stack.
         * @return int
         */
        public int peek() {
            if (!isEmpty()) {
                return arr[top];
            } else {
                System.exit(-1);
            }
            return -1;
        }

        /**
         * Function to return the size of the stack.
         * @return int
         */
        public int size() {
            return top + 1;
        }

        /**
         * Function to check if the stack is empty or not.
         * @return true/false
         */
        private boolean isEmpty() {
            return top == -1;
        }

        /**
         * Function to check if the stack is full or not.
         * @return true/false
         */
        private boolean isFull() {
            return top == capacity - 1;
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(3);
        stack.push(1); // inserting 1 to the stack
        stack.push(2); // inserting 2 to the stack

        stack.pop(); // removing the top element (2)
        stack.pop(); // removing the top element (1)

        stack.push(3); // inserting 3 to the stack

        System.out.println("The top element is " + stack.peek());
        System.out.println("The stack size is " + stack.size());

        stack.pop(); // removing the top element (3)

        // check if the stack is empty
        if (stack.isEmpty()) {
            System.out.println("The stack is empty.");
        } else {
            System.out.println("The stack is not empty.");
        }
    }

    /**
     * Stack using LinkedList.
     */
    public static class LLNode {
        int data;
        LLNode next;
        LLNode(int data) {
            this.data = data;
        }
    }
    public static class StackLL {
        public LLNode push(int data, LLNode head) {
            LLNode node = new LLNode(data);
            if (!isEmpty(head)) {
                node.next = head;
            }
            head = node;
            return head;
        }
        public LLNode pop(LLNode head) {
            if (isEmpty(head)) {
                System.out.println("StackOverflow\n Program Terminated \n");
                System.exit(-1);
            } else {
                head = head.next;
            }
            return head;
        }

        public int peek(LLNode head) {
            if (isEmpty(head)) {
                System.out.println("StackOverflow\n Program Terminated \n");
                System.exit(-1);
            }
            return head.data;
        }

        public void displayStack(LLNode head) {
            System.out.println("Stack: ");
            if (isEmpty(head)) {
                System.out.println("Stack is empty.");
                return;
            }
            LLNode temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        public boolean isEmpty(LLNode head) {
            return head == null;
        }

        public static void main(String[] args) {
            StackLL stackLL = new StackLL();
            LLNode head = null;
            head = stackLL.push(1, null);
            head = stackLL.push(2, head);
            head = stackLL.push(3, head);

            stackLL.displayStack(head);

            head = stackLL.pop(head);

            stackLL.displayStack(head);
        }
    }


    /**
     * Stack is also included in Java's collection.
     */
    public static class StackUsingJavaCollection {
        public static void main(String[] args) {
            java.util.Stack<String> stack = new java.util.Stack<String>();
            stack.push("First");
            stack.push("Second");
            stack.push("Third");
            stack.push("Fourth");

            System.out.println("The top element is: " + stack.peek());
            System.out.println("The stack size is: " + stack.size());
            stack.pop();
            stack.pop();

            System.out.println("The top element is: " + stack.peek());
            System.out.println("The stack size is: " + stack.size());

            if (stack.isEmpty()) {
                System.out.println("The stack is empty.");
            } else {
                System.out.println("The stack is not empty.");
            }
        }
    }
}
