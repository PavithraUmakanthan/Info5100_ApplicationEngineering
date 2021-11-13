package h4_Part1;

public class ThreadsafeLinkedlist implements Runnable{

    LinkedList list1;
    @Override
    public void run() {
        list1.addAtPosition(0,1);
        list1.addAtPosition(1,10);
        list1.addAtPosition(2,20);
        list1.addAtPosition(3,30);
        System.out.println(list1.size());
        System.out.println(list1.getFirst());
        System.out.println(list1.getLast());
        list1.removeAtPosition(2);
        System.out.println(list1.size());
    }
    public ThreadsafeLinkedlist() {
        list1 = new LinkedList();
    }
}
