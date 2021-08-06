package linked.list;

public class LinkedList<T> {

    Node<T> head;

    public void insert(T value)  {
        Node<T> newInsertNode = new Node<T>(value);
        if (head != null) {
            newInsertNode.next = head;
        }
        head = newInsertNode;
    }

    public boolean includes(T value){
        Node<T> current = head;
        while (current != null) {
            if (value == current.value)return true;
            current = current.next;
        }
        return false;
    }

    public String toString(){
        String result = "";
        Node<T> current = head;
        while (current != null) {
            result = result + "{ "+ current.value + " } -> ";
            if (current.next == null) {
                result = result + "NULL";
                return result;
            }
            current = current.next;
        }
        return result;
    }

    public void append(T value)  {
        Node<T> newInsertNode = new Node<T>(value);
        if (head == null) {
            head = newInsertNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
                current.next = newInsertNode;
        }
    }

    public void insertBefore(T value, T newValue) {
        Node<T> newInsertNode = new Node<T>(newValue);
        if (head == null) {
            head = newInsertNode;
        } else if (head.value == value) {
            insert(newValue);
        } else {
            Node<T> current = head;
            while (current.next != null) {
                if (current.next.value == value) {
                    newInsertNode.next = current.next;
                    current.next = newInsertNode;
                    break;
                }
                current = current.next;
            }
        }
    }

    public void insertAfter(T value, T newValue) {
        Node<T> newInsertNode = new Node<T>(newValue);
        if (head == null) {
            head = newInsertNode;
        } else {
            Node<T> current = head;
            while (current != null) {
                if (current.value == value) {
                    newInsertNode.next = current.next;
                    current.next = newInsertNode;
                }
                current = current.next;
            }
        }
    }

    public String kthFromEnd(int idx) {

        if (head == null) return "Exception";

        Node<T> current = head;
        int counter = 0;
        while (current.next != null) {
            current = current.next;
            counter++;
        }

        if (idx > counter || idx < 0) {
            return "Exception";
        } else {
            current = head;
            for (int i = 0; i <= counter-idx; i++) {
                if (i == counter-idx) {
                    return "{"+current.value+"}";
                }
                current = current.next;
            }
        }
        return "Exception";
    }

    public Node<T> zipLists(LinkedList<T> list1, LinkedList<T> list2) {

        if (list1.head == null && list2.head == null) return null;
        if (list1.head == null) return list2.head;
        if (list2.head == null) return list1.head;

        Node<T> current = list1.head;
        Node<T> list1Current = current.next;
        Node<T> list2Current = list2.head;

        while (current != null && (list2Current != null || list1Current != null)) {
            if (list2Current != null) {
                current.next = list2Current;
                list2Current = list2Current.next;
                current = current.next;
            }
            if (list1Current != null) {
                current.next = list1Current;
                list1Current =  list1Current.next;
                current = current.next;
            }
        }
        return list1.head;
    }

    /* ------- Reverse List Canceled Solution --------- */
//    public LinkedList<T> reverseList(LinkedList<T> list) {
//        if (list.head == null) return null;
//        Node<T> current = list.head;
//        LinkedList<T> newList = new LinkedList<T>();
//        while (current != null){
//            Node<T> newInsertNode = new Node<T>(current.value);
//            newInsertNode.next = newList.head;
//            newList.head = newInsertNode;
//            current = current.next;
//        }
//        System.out.println(newList);
//        return newList;
//    }

    public LinkedList<T> reverseList(LinkedList<T> list) {
        if (list.head == null || list.head.next == null) return list;
        Node<T> current = list.head;
        Node<T> nCurrent = current.next;
        Node<T> pCurrent = list.head;
        while (nCurrent != null){
            current.next = nCurrent.next;
            nCurrent.next = pCurrent;
            pCurrent = nCurrent;
            nCurrent = current.next;
        }
        list.head = pCurrent;
        return list;
    }
}
