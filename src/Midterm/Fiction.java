package Midterm;

public class Fiction extends Book implements iBorrowable{

    public  int startDate;
    public  int endDate;

    public Fiction(String title, double price, String publishYear) {
        super(title, price, publishYear);
    }

    public String description(){
        return( "Frankenstein all events are imaginary and not based on real facts ");
    }

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
// The methods declared in the interface will be defined and implemented here only
// after implementing the interface