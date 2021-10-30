package Midterm;

public abstract class Book{

    public static String title;
    public static double price;
    public static String publishYear;

    public static String getTitle() {
        return title;
    }

    public static double getPrice() {
        return price;
    }

    public static String getPublishYear() {
        return publishYear;
    }

    public static void setTitle(String title) {
        Book.title = title;
    }

    public static void setPrice(double price) {
        Book.price = price;
    }

    public static void setPublishYear(String publishYear) {
        Book.publishYear = publishYear;
    }

    public Book(String title, double price, String publishYear){

    }

    public abstract String description();

    //we can declare abstract method, abstract variables only in abstract class.
    // For defining the abstract method in any other class we need to
    // extend the abstract class in our class

}
