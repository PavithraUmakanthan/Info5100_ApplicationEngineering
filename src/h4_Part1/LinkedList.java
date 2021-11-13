package h4_Part1;

public class LinkedList{
    int size;
    Node head;

    public LinkedList(){
        size = 0;
        head = new Node(-1, null);

    }


        public void addAtPosition ( int index, int value){
            if (index > size) {
                return;
            }
            if (index < 0) {
                index = 0;
            }

            Node currentNode = head;
            while (index < size) {
                currentNode = currentNode.next;
                index++;
            }
            Node temp = new Node(value);
            temp.next = currentNode.next;
            currentNode.next = temp;
            size++;
            System.out.println("Added new Position");
        }

        public void removeAtPosition ( int index){
            if (index > size) {
                return;
            }
            if (index < 0) {
                index = 0;
            }

            Node currentNode = head;
            while (index < size) {
                currentNode = currentNode.next;
                index++;
            }
            currentNode.next = currentNode.next.next;
            size--;
        }


        public int getFirst () {
            return head.next.value;
        }

        public int getLast () {
            Node currentNode = head.next;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            return currentNode.value;
        }

        public int size () {
            return size;
        }
    }
