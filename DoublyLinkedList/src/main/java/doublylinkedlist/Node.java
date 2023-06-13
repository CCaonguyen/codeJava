package doublylinkedlist;


class Node {
    int data;
    Node prev;
    Node next;

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    private Node head;
    private Node tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void delete(int value) {
        Node curr = head;
        while (curr != null) {
            if (curr.data == value) {
                if (curr == head) {
                    head = curr.next;
                    if (head != null) {
                        head.prev = null;
                    } else {
                        tail = null;
                    }
                } else if (curr == tail) {
                    tail = curr.prev;
                    tail.next = null;
                } else {
                    curr.prev.next = curr.next;
                    curr.next.prev = curr.prev;
                }
                break;
            }
            curr = curr.next;
        }
    }

    public Node search(int value) {
        Node curr = head;
        while (curr != null) {
            if (curr.data == value) {
                return curr;
            }
            curr = curr.next;
        }
        return null;
    }
}
