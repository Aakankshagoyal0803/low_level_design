public class demo {
    public static void main(String[] args) 
    {
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        PaymentStrategy paymentStrategy = new CreditCardPS();
        paymentProcessor.SetPaymentStrategy(paymentStrategy);
        paymentProcessor.ProcessPayment(100.0);


        PaymentStrategy paymentStrategy1 = new CryptoPS();
        paymentProcessor.SetPaymentStrategy(paymentStrategy1);
        paymentProcessor.ProcessPayment(50.0);
    }
}

interface PaymentStrategy{
    public void processPayment(double amount);
}

class CreditCardPS implements PaymentStrategy{

    @Override
    public void processPayment(double amount) {
        System.out.println("using credit card to pay amount - " + amount);
    }

}

class PayPalPS implements PaymentStrategy{

    @Override
    public void processPayment(double amount) {
        System.out.println("using Pay pal to pay amount - " + amount);
    }

}

class CryptoPS implements PaymentStrategy{

    @Override
    public void processPayment(double amount) {
        System.out.println("using Crypto to pay amount - " + amount);
    }

}

class PaymentProcessor {
    private PaymentStrategy paymentStrategy;
    
    public PaymentProcessor() {
        paymentStrategy = null;
    }

    public void SetPaymentStrategy(PaymentStrategy ppaymentStrategy)
    {
        if(paymentStrategy != null){
            paymentStrategy = null;
        }

        paymentStrategy = ppaymentStrategy;
    }

    public void ProcessPayment(double amount)
    {
        paymentStrategy.processPayment(amount);
    }

    public void finalize() {
        if (paymentStrategy != null) {
            // Clean up the strategy instance
            paymentStrategy = null;
        }
    }
}

