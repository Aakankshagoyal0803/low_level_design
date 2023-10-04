public class demo {
    public static void main(String[] args) {

        OrderProcessingTemplate local = new LocalDeliverySystem();
        local.processorder();

        OrderProcessingTemplate  international = new InternationalDeliverySystem();
        international.processorder();
    }
}


abstract class OrderProcessingTemplate{
    public void processorder()
    {
        verifyOrder();
        assignDP();
        trackOrder();
    }

    abstract void verifyOrder();
    abstract void assignDP();
    abstract void trackOrder();
}

class LocalDeliverySystem extends OrderProcessingTemplate{

    @Override
    void verifyOrder() {
        System.out.println("Local verifying order");
    }

    @Override
    void assignDP() {
        
        System.out.println("Local assigning delivery partner");
    }

    @Override
    void trackOrder() {
        
        System.out.println("Local track order");
    }
    
}

class InternationalDeliverySystem extends OrderProcessingTemplate{

    @Override
    void verifyOrder() {
        System.out.println("International verifying order");
    }

    @Override
    void assignDP() {
        
        System.out.println("International assigning delivery partner");
    }

    @Override
    void trackOrder() {
        
        System.out.println("International track order");
    }
    
}
