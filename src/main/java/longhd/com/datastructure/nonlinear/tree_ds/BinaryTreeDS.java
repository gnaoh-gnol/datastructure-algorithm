package longhd.com.datastructure.nonlinear.tree_ds;

/**
 * Tree is a non-linear data structure where data objects are generally organized in terms of hierarchical relationship.
 * A binary tree is a recursive tree data structure where each node can have 2 children at most.
 * Types of Binary Trees:
 *      + Full Binary Trees: is a binary tree where every node has exactly 0 or 2 children.
 <p>                     *
                       *   *
                     *   *
                       *   *
 </p>
 *      + Perfect Binary Trees: is a Binary Trees if all internal nodes have 2 children
 *      and all leaves are at the same level.
 <p>                      *
                        *   *
                      *   *   *
 <p/>
 *      + Complete Binary Trees: is a Binary Trees in which every level, except possibly the last, is completely filled,
 *      and all nodes are as far left as possible.
 <p>                       *
                         *   *
                       *   *   *
                     *   *
 </>
 */
public class BinaryTreeDS {
    public static class Node {
        private int value;
        private Node left, right;
        Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public void insert(Node node, int value) {
        if (value < node.value) {
            if (node.left != null) {
                insert(node.left, value);
            } else {
                System.out.println(" Inserted " + value + " to left of " + node.value);
                node.left = new Node(value);
            }
        } else if (value > node.value) {
            if (node.right != null) {
                insert(node.right, value);
            } else {
                System.out.println(" Inserted " + value + " to right of " + node.value);
                node.right = new Node(value);
            }
        }
    }

    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.value);
            traverseInOrder(node.right);
        }
    }

    public static void main(String args[]) {
        BinaryTreeDS tree = new BinaryTreeDS();
        Node root = new Node(5);
        System.out.println("Binary Tree Example");
        System.out.println("Building tree with root value " + root.value);
        tree.insert(root, 2);
        tree.insert(root, 4);
        tree.insert(root, 8);
        tree.insert(root, 6);
        tree.insert(root, 7);
        tree.insert(root, 3);
        tree.insert(root, 9);
        System.out.println("Traversing tree in order");
        tree.traverseInOrder(root);
    }
}
