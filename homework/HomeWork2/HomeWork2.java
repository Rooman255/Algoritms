package HomeWork2;

public class HomeWork2<E> {
    private Node head;

    public static void main(String[] args) {
        HomeWork2<Integer> integerHomeWork2 = new HomeWork2<>();
        integerHomeWork2.add(92);
        integerHomeWork2.add(34);
        integerHomeWork2.add(58);
        integerHomeWork2.add(81);
        integerHomeWork2.revert();
    }

    public void add(E value) {
        Node newNode = new Node();
        newNode.value = value;
        if (head != null) {
            newNode.nextNode = head;
        }
        head = newNode;
    }

    public void revert() {
        if (head != null && head.nextNode !=null) {
            Node temp = head;
            revert(head.nextNode, head);
            temp.nextNode = null;
        }
    }

    private void revert(Node currentNode, Node previousNode) {
        if (currentNode.nextNode == null) {
            head = currentNode;
        } else {
            Node nextNode = currentNode.nextNode;
            currentNode.nextNode = previousNode;
            revert(nextNode, currentNode);
        }
    }

    private class Node {
        private E value;
        private Node nextNode;
    }
}
