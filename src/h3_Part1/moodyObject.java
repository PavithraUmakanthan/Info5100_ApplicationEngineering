package h3_Part1;

public abstract class moodyObject {

    public abstract String getMood();

    public abstract void ExpressFeelings();

    public void queryMood() {

       System.out.println("I feel " + getMood() + " Today!!");

    }

}
