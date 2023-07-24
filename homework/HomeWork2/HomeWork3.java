package HomeWork2;

class ListNode {
    int val;
    ListNode next;
    
    ListNode(int val) {
        this.val = val;
    }
}

public class HomeWork3 {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;
        
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        
        return prev;
    }

    public static void main(String[] args) {
        HomeWork3 reverseLinkedList = new HomeWork3();

        ListNode head = new ListNode(12);
        head.next = new ListNode(32);
        head.next.next = new ListNode(53);
        head.next.next.next = new ListNode(24);
        head.next.next.next.next = new ListNode(95);

        ListNode reversedHead = reverseLinkedList.reverseList(head);

        // Выводим развернутый список
        while (reversedHead != null) {
            System.out.print(reversedHead.val + " ");
            reversedHead = reversedHead.next;
        }
    }
}