package h4_Part2;

public class Main {

    public static void main(String args[]){

    Thread thread = new Thread(new ThreadTrafficLight());
    thread.start();

    }
}
