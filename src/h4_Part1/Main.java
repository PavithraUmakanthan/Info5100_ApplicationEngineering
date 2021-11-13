package h4_Part1;

public class Main {

    public static void main (String args[]) {

        Thread thread = new Thread(new ThreadsafeLinkedlist());
        thread.start();
    }
}
