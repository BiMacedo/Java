package ListItem;

public class ListItem {
    private Node head;

    public void add(int value) {
        if (head == null) {
            head = new Node(value);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(value);
        }
    }

    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void clear() {
        head = null;
    }

    public int get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Índice inválido");
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.value;
    }

    public int remove(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Índice inválido");
        }
        if (index == 0) {
            int value = head.value;
            head = head.next;
            return value;
        }
        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        int value = current.next.value;
        current.next = current.next.next;
        return value;
    }

    public boolean contains(int item) {
        Node current = head;
        while (current != null) {
            if (current.value == item) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public boolean set(int index, int value) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Índice inválido");
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.value = value;
        return true;
    }

    private static class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}