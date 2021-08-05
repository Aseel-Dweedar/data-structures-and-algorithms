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

        LinkedList<T> newZippedList = new LinkedList<T>();
        newZippedList.head = list1.head;

        Node<T> current = list1.head;
        list1.head = list1.head.next;

        while (current != null && (list2.head != null || list1.head != null)) {
            if (list2.head != null) {
                current.next = list2.head;
                list2.head = list2.head.next;
                current = current.next;
            }
            if (list1.head != null) {
                current.next = list1.head;
                list1.head = list1.head.next;
                current = current.next;
            }
        }
        return newZippedList.head;
    }

    public LinkedList<T> reverseList(LinkedList<T> list) {
        if (list.head == null) return null;
        Node<T> current = list.head;
        LinkedList<T> newList = new LinkedList<T>();
        while (current != null){
            Node<T> newInsertNode = new Node<T>(current.value);
            newInsertNode.next = newList.head;
            newList.head = newInsertNode;
            current = current.next;
        }
        System.out.println(newList);
        return newList;
    }
}
