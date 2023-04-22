package lesson_1;

import java.awt.Color;
import java.util.LinkedList;
import java.util.Queue;

public class Tree<V extends Comparable<V>> {
    private Node root;



    public boolean add(V value) {
        if (root == null) {
            root = new Node(value, Color.BLACK);
            return true;
        }

        boolean result = addNode(root, value);
        root = rebalance(root);
        root.color = Color.BLACK;
        return result;
    }

    private boolean addNode(Node node, V value) {
        if (node.value.compareTo(value) == 0) {
            return false;
        }

        if (node.value.compareTo(value) > 0) {
            if (node.left != null) {
                boolean result = addNode(node.left, value);
                node.left = rebalance(node.left);
                return result;
            } else {
                node.left = new Node(value, Color.RED);
                return true;
            }
        } else {
            if (node.right != null) {
                boolean result = addNode(node.right, value);
                node.right = rebalance(node.right);
                return result;
            } else {
                node.right = new Node(value, Color.RED);
                return true;
            }
        }
    }

    private Node rebalance(Node node) {
        if (node.right != null && node.right.color == Color.RED
                && (node.left == null || node.left.color == Color.BLACK)) {
            node = rotateLeft(node);
        }
        if (node.left != null && node.left.color == Color.RED
                && (node.left.left != null && node.left.left.color == Color.RED)) {
            node = rotateRight(node);
        }
        if (node.left != null && node.left.color == Color.RED
                && node.right != null && node.right.color == Color.RED) {
            flipColors(node);
        }
        return node;
    }

    private Node rotateLeft(Node node) {
        Node rightChild = node.right;
        node.right = rightChild.left;
        rightChild.left = node;
        rightChild.color = node.color;
        node.color = Color.RED;
        return rightChild;
    }

    private Node rotateRight(Node node) {
        Node leftChild = node.left;
        node.left = leftChild.right;
        leftChild.right = node;
        leftChild.color = node.color;
        node.color = Color.RED;
        return leftChild;
    }

    private void flipColors(Node node) {
        node.color = Color.RED;
        node.left.color = Color.BLACK;
        node.right.color = Color.BLACK;
    }

    public void printTree() {
        if (root == null) {
            System.out.println("Tree is empty.");
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            System.out.print(node.value + " ");
            if (node.left != null) {
                queue.add(node.left);

            }

            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }

    private class Node {
        private V value;
        private Color color;
        private Node left;
        private Node right;

        public Node(V value, Color color) {
            this.value = value;
            this.color = color;
        }



    }
}
