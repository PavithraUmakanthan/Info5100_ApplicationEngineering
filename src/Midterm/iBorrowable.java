package Midterm;

public  interface iBorrowable {

    void setBorrowDate(int day);
    void setReturnDate(int day);
    boolean isAvailable(int day);

}

// interface is used to declare methods which can be override or defined in any other class
// using implements to inherit the interface property


