package exercise.day3.exercise9I;

import exercise.day3.exercise9I.OrderItem;

public class Order {

    private int maxOrderItem;
    private OrderItem [] orderItems;

    private int nextIndex = 0;

    public Order (int maxOrderItem){
        this.maxOrderItem = maxOrderItem;
        orderItems = new OrderItem[maxOrderItem];
    }

    public boolean addItem (OrderItem orderItem) {
        if (!orderItem.isCorrect()) {
            if (nextIndex >= maxOrderItem) {
                return false;
            }
            if (nextIndex >= maxOrderItem) {
                System.out.println("Order is full");
                return false;
            }
            orderItems[nextIndex] = orderItem;
            nextIndex++;
            return true;
        }

        return false;
    }
}
