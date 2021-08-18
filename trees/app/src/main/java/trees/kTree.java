package trees;

import java.util.ArrayList;
import java.util.List;

class kAryTree {

    public kAryTree child[];
    public int value;

    public kAryTree(){}

    public kAryTree (int numberOfChildren, int value) {
        child = new kAryTree[numberOfChildren];
        this.value = value;
    }

    public List<String> newList = new ArrayList<>();
    public List treeFizzBuzz(kAryTree treeRoot) {
        if (treeRoot == null) return null;
        int allChildren = treeRoot.child.length;
        for (int i = 0; i < allChildren - 1; i++)
            treeFizzBuzz(treeRoot.child[i]);
        if (treeRoot.value % 3 == 0 && treeRoot.value % 5 == 0){
            newList.add("FizzBuzz");
        } else if (treeRoot.value % 3 == 0) {
            newList.add("Fizz");
        }  else if (treeRoot.value % 5 == 0) {
            newList.add("Buzz");
        } else {
            newList.add("\""+treeRoot.value+"\"");
        }
        treeFizzBuzz(treeRoot.child[allChildren - 1]);
        return newList;
    }

}
