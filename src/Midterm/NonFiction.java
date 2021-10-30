package Midterm;

public class NonFiction extends Book implements iBorrowable{

    public  int startDate;
    public  int endDate;

    public NonFiction(String title, double price, String publishYear) {
        super(title, price, publishYear);
    }

    @Override
    public String description() {
        return( "Anne Frank all events are imaginary and not based on real facts ");
    }

    // we have to define the abstract method only in the child class after
    // extending the abstract class as parent class

    public void setBorrowDate(int day) {
        startDate = day;
    }

    public void setReturnDate(int day) {
        endDate = day;
    }

    public boolean isAvailable(int day) {
        if(day > endDate && day < startDate){
            return true;
        }
        return true;
    }
}



