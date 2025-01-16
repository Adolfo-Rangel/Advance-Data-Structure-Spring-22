package Circularlinklist;

public class SinglyLinkCirc {
    //the only access to the list is a single reference, current, that can point to any node on the list.
    // My list should handle insertion, searching, and deletion.
    //also a display method to display the list
    // a step method that moves current along to the next link might come in handy too.
    // our temp is our current

    private Node head;
    private Node tail;

    public SinglyLinkCirc() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public boolean search(int val) {
        Node curr = head;
        if (head != null) {
            do {
                if (curr.value == val) {
                    return true;
                }
                curr = curr.next;
            } while (curr != head);
        }
        return false;
    }

    public void delete(int val) {
        Node curr = head;
        if (curr == null) {
            return;
        }
        if (curr.value == val) {
            head = head.next;
            tail.next = head;
        }

        do {
            Node n = curr.next;
            if(n.value == val) {
                curr.next = n.next;
                break;
            }
            curr = curr.next;
        } while (curr != head);

    }

    public void display(){
        Node curr = head;
        if (head != null) {
            do {
                System.out.print(curr.value + " -> ");
                curr = curr.next;
            } while (curr != head);
        }
        System.out.print("END");

    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
