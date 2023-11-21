package DataStructures;

public class LinkedList {

    public Node header;

    public Node tail;

    public int size;

    public LinkedList() {
        header = new Node(null);
        tail = header;
        size = 0;
    };

    public int size() {
        return size;
    };

    public void prepend(Integer data) {
        Node n = new Node(data);
        if (size == 0) {
            header.next = n;
            tail = n;
            size++;
        } else {
            Node temp = header.next;
            header.next = n;
            n.next = temp;
            size++;
        }
    };

    public void append(Integer data) {
        Node n = new Node(data);
        if (size == 0) {
            header.next = n;
            tail = n;
            size++;
        } else {
            tail.next = n;
            tail = n;
            size++;
        }
    };

    public void insertAt(Integer index, Integer data) {
        if (index < 0 || index > size) {
            return;
        } else if (index == 1) {
            prepend(data);
        } else if (index == size) {
            append(data);
        } else {
            Node n = new Node(data);
            Node temp = header.next;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            n.next = temp.next;
            temp.next = n;
            size++;
        }
    };

    public void removeAt(Integer index) {
        if (index < 0 || index > size) {
            return;
        } else if (index == 1) {
            removeFirst();
        } else if (index == size) {
            removeLast();
        } else {
            Node n = header.next;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            n.next = n.next.next;
            size--;
        }
    };

    public void removeFirst() {
        if (size == 0) {
            System.out.println("List is empty");
        } else {
            header.next = header.next.next;
            size--;
        }
    };

    public void removeLast() {
        if (size == 0) {
            System.out.println("List is empty");
        } else {
            Node n = header.next;
            while (n.next != tail) {
                n = n.next;
            }
            n.next = null;
            tail = n;
            size--;
        }

    };

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node n = header.next;
        while (n != null) {
            sb.append(n.data).append(" -> ");
            n = n.next;
        }
        return sb.toString();
    };

    ;


}
