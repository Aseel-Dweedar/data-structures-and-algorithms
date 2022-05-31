package trees;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.MIN_VALUE;

public class BinaryTree<T> {

    public List<T> preOrderList = new ArrayList<>();
    public List<T> inOrderList = new ArrayList<>();
    public List<T> postOrderList = new ArrayList<>();
    public Node<Integer> root;

    public BinaryTree() {
    }

    public BinaryTree(Node<Integer> root) {
        this.root = root;
    }

    public List<T> preOrder(Node<T> root) {
        try {
            preOrderList.add(root.value);
            if (root.leftChild != null) preOrder(root.leftChild);
            if (root.rightChild != null) preOrder(root.rightChild);
        } catch (NullPointerException exception) {
            System.out.println(exception.getMessage());
        }
        return preOrderList;
    }

    public List<T> inOrder(Node<T> root) {
        try {
            if (root.leftChild != null) inOrder(root.leftChild);
            inOrderList.add(root.value);
            if (root.rightChild != null) inOrder(root.rightChild);
        } catch (NullPointerException exception) {
            System.out.println(exception.getMessage());
        }
        return inOrderList;
    }

    public List<T> postOrder(Node<T> root) {
        try {
            if (root.leftChild != null) postOrder(root.leftChild);
            if (root.rightChild != null) postOrder(root.rightChild);
            postOrderList.add(root.value);
        } catch (NullPointerException exception) {
            System.out.println(exception.getMessage());
        }
        return postOrderList;
    }

//    public int maximumValue() {
//        if (root == null) return 0;
//        if (root.leftChild == null || root.rightChild == null) return root.value;
//        int max = 0;
//        List<Integer> maxList = (List<Integer>) postOrder((Node<T>) root);
//        for (int i = 0; i < maxList.size(); i++) {
//            if (maxList.get(i) >= max) {
//                max = maxList.get(i);
//            }
//        }
//        return max;
//    }

    public int maximumValue() {
        if (this.root == null) return 0;
        return maximumValueHelper(this.root);
    }

    public int maximumValueHelper(Node<Integer> root) {
         if (root == null) return MIN_VALUE;
         int max = root.value;
         int leftNode = maximumValueHelper(root.leftChild);
         int rightNode = maximumValueHelper(root.rightChild);

         if (leftNode > max) max = leftNode;
         if (rightNode > max) max = rightNode;

         return max;
    }



    @Override
    public String toString() {
        if (preOrderList.isEmpty() && inOrderList.isEmpty() && postOrderList.isEmpty()) return "Empty List";
        return "preOrderList=" + preOrderList +
                ", inOrderList=" + inOrderList +
                ", postOrderList=" + postOrderList;
    }

}
