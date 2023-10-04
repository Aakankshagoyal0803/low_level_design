public class demo {
    public static void main(String[] args) 
    {
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        paymentProcessor.SetPaymentStrategy("CreditCard");
        paymentProcessor.ProcessPayment(100.90);

        paymentProcessor.SetPaymentStrategy("PayPal");
        paymentProcessor.ProcessPayment(90.90);
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

// PaymentStrategyFactory
// static instance no object creation needed.
class PaymentStrategyFactory {
    public static PaymentStrategy createPaymentStrategy(String paymentMethod) {
        if (paymentMethod.equals("CreditCard")) {
            return new CreditCardPS();
        } else if (paymentMethod.equals("PayPal")) {
            return new PayPalPS();
        } else if (paymentMethod.equals("Cryptocurrency")) {
            return new CryptoPS();
        } else {
            // Default to CreditCardPayment
            return new CreditCardPS();
        }
    }
}


class PaymentProcessor {
    private PaymentStrategy paymentStrategy;
    
    public PaymentProcessor() {
        paymentStrategy = null;
    }

    public void SetPaymentStrategy(String paymentMethod)
    {
        if(paymentStrategy != null){
            paymentStrategy = null;
        }

        paymentStrategy = PaymentStrategyFactory.createPaymentStrategy(paymentMethod);;
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

