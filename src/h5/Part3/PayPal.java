package h5.Part3;

public class PayPal implements PaymentStrategy{

    public String email;
    @Override
    public void pay(int price) {
        System.out.println("Paypal: $" + price);
    }
    public PayPal(String email){
        this.email= email;
    }
}
