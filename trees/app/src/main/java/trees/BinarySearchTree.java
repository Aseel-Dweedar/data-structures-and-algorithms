package trees;

import java.util.Objects;

public class BinarySearchTree extends BinaryTree {

    public BinarySearchTree(Node root) {
        super(root);
    }

    void insert(int key) {
        root = insertRec(root, key);
    }

    Node insertRec(Node<Integer> root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (value < root.value)
            root.leftChild = insertRec(root.leftChild, value);
        else if (value > root.value)
            root.rightChild = insertRec(root.rightChild, value);
        return root;
    }

    public void add(Integer value) {
        if (root.value == null) {
            root = new Node<>(value);
        } else {
            Node<Integer> current = root;
            Node<Integer> newNode = new Node<>(value);
            while (!value.equals(current.value) && (current.rightChild != newNode || current.leftChild != newNode)) {
                if (value < current.value) {
                    if (current.leftChild == null) current.leftChild = newNode;
                    else current = current.leftChild;
                } else {
                    if (current.rightChild == null) current.rightChild = newNode;
                    else current = current.rightChild;
                }
            }
        }
    }

//    public boolean contains(Integer value) {
//        if (root == null) return false;
//        if (value.equals(root.value)) return true;
//
//        Node<Integer> current = root;
//        while (current.leftChild != null || current.rightChild != null) {
//            if (value < current.value && current.leftChild != null) {
//                current = current.leftChild;
//            } else if (value > current.value && current.rightChild != null) {
//                current = current.rightChild;
//            } else return false;
//            if (value.equals(current.value)) return true;
//        }
//        return false;
//    }

    public boolean contains(Node<Integer> treeRoot, Integer value) {
        if (treeRoot == null) return false;
        if (Objects.equals(treeRoot.value, value)) return true;
        if (value < treeRoot.value) return contains(treeRoot.leftChild, value);
        return contains(treeRoot.rightChild, value);
    }
}
