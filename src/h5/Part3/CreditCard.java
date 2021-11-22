package h5.Part3;

public class CreditCard implements PaymentStrategy{

    public String cardNumber;

    @Override
    public void pay(int price) {
        System.out.println("CreditCard: $" + price);
    }

    public CreditCard(String cardNumber){

        this.cardNumber = cardNumber;
   }
}