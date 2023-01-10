public class linkList {
    class Node {
        int val;
        Node pre;
        Node next;
        public  Node(int val){
            this.val=val;
        }
    }
    class DoublyLinkedList {
        Node head;
        Node tail;

        public void addHead(int val) {
            Node newNode = new Node(val);
            if (head == null) {
                head = tail = newNode;
            } else {
                newNode.next = head;
//              將前一個值，指定為現在輸入值的下一個
                head.pre = newNode;
//              將輸入值指定為前一個值的前一個
                head = newNode;
//              將輸入值指定為head

            }
        }

        public void addToTail(int val) {
            Node newNode = new Node(val);
            if (tail == null) {
                head = tail = newNode;
            } else {
                newNode.pre = tail;
                tail.next = newNode;
                tail = newNode;
            }

        }


    }
}
