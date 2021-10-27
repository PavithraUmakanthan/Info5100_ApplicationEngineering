package Midterm;

public class Printer {

    private static Printer instance;

    private Printer() {
    }

    public static Object obj = new Object();

    public static Printer getInstance() {

        synchronized (obj) {
            if (instance == null) {
                instance = new Printer();
            }
        }
        return instance;
    }

    public static void getConnection() {
        if (instance != null) {
            System.out.println("Your Printer is working");
        }
    }
}


   /* HashMap<Integer, Printer> newPrinter = new HashMap<>();

    public Printer getConnection(Integer Id) {

        synchronized (obj) {
            if (newPrinter.containsKey(Id) == false) {
                newPrinter.put(Id, new Printer());
            }
        }
        return newPrinter.get(Id);
    }
}


*/