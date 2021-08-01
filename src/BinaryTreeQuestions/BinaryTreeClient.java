package BinaryTreeQuestions;

public class BinaryTreeClient {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.displayTree();
//        bt.height();
        System.out.println("Height of Tree is : " + bt.height());
        bt.preOrderTraverse();
    }
}
