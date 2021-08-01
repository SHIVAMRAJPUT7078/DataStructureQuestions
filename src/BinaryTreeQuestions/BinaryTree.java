package BinaryTreeQuestions;

import java.util.Scanner;

public class BinaryTree {
    Scanner sc = new Scanner(System.in);

    private class Node {
        int value;
        Node left;
        Node right;

//        Node(int value){
//            this.value = value;
//            this.left = null;
//            this.right = null;
//        }
    }

    public BinaryTree() {
        this.root = this.construct(null, true);
    }

    private Node root;


    private Node construct(Node parent, boolean ilc) {
        if (parent == null) { // means this is the root node as root node does not have its parent node
            System.out.println("Enter the value of root");
        } else {
            if (ilc) {
                System.out.println("Enter the left child of " + parent.value);
            } else {
                System.out.println("Enter the right child of " + parent.value);
            }

        }
        int data = sc.nextInt();
        Node node = new Node();
        node.value = data;
        System.out.println("Kya " + data + " Ka left child hai");
        boolean kyaLeftChildHai = sc.nextBoolean();
        if (kyaLeftChildHai) {
            node.left = construct(node, true);
        }
        System.out.println("Kya " + data + " Ka right child hai");
        boolean kyaRightChildHai = sc.nextBoolean();
        if (kyaRightChildHai) {
            node.right = construct(node, false);
        }
        return node;
    }


    public void displayTree() {
        this.displayTree(this.root);
    }

    private void displayTree(Node node) {
        if (node == null) {
//            System.out.println(root.value);
            return;
        }
        String str = "";
        if (node.left == null) {
            str += '_';
        } else {
            str += node.left.value;
        }

        str += " -> " + node.value + " <- ";

        if (node.right == null) {
            str += '_';
        } else {
            str += node.right.value;
        }

        System.out.println(str);
        displayTree(node.left);
        displayTree(node.right);
    }

    public int height() {
        return this.height(this.root);
    }

    private int height(Node node) {
        if (node == null) {
            return 0;
        }
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public void preOrderTraverse() {
        this.preOrderTraverse(this.root);
    }

    private void preOrderTraverse(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        preOrderTraverse(node.left);
        preOrderTraverse(node.right);
    }


// 1 true 2 true 4 false false false true 3 false false

}
