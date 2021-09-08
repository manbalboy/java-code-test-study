package linkedlist;

public class SingleLinkedList<T> {
    Node<T> head = null;

    public void addNode(T data) {
        if (head == null) {
            this.head = new Node<>(data);
        } else {
            Node<T> node = this.head;

            while (node.next != null) {
                node = node.next;
            }

            node.next = new Node<>(data);
        }
    }

    public void printAll() {
        if (this.head != null) {
            Node<T> node = this.head;

            do {
                System.out.println(node.data);
                node = node.next;
            } while (node.next != null);
            System.out.println(node.data);

        }
    }

    public Node<T> searchNode(T data) {
        if (this.head == null) {
            return null;
        } else {
            Node<T> node = this.head;
            while (node != null) {
                if (node.data == data) {
                    return node;
                } else {
                    node = node.next;
                }
            }
            return null;
        }
    }

    public void addNodeInside(T data, T isData) {
        Node<T> searchedNode = this.searchNode(isData);

        if (searchedNode == null) {
            this.addNode(data);
        } else {
            Node<T> nextNode = searchedNode.next;
            searchedNode.next = new Node<T>(data);
            searchedNode.next.next = nextNode;


        }
    }


    public boolean deleteNode(T isData) {
        Node<T> searchedNode = this.searchNode(isData);

        if (searchedNode == null) {
            return false;
        } else {
            Node<T> node = this.head;
            if (node.data == isData) {
                this.head = this.head.next;
                return true;
            } else {
                while (node.next != null) {
                    if (node.next.data == isData) {
                        node.next = node.next.next;
                        return true;
                    }
                    node = node.next;
                }
                return false;
            }
        }

    }
}
