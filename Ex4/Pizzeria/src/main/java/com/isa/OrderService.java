package com.isa;

public class OrderService {
    public void completeOrder(BaseOfOrders myBaseOfOrders, Client client, String... parts) {
        client.addParticularOrderPart(parts);
        try {
            myBaseOfOrders.addOrders(new Order(client, client.getOrderParticularParts()));
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
