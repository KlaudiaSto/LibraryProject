package exercise.day3.exercise9I;

import java.util.Objects;

public class OrderItem {

    private String productName;
    private int quantity;
    private double price;

    public OrderItem(String productName, int quantity, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public double getAmount() {
        return quantity * price;
    }

    public boolean isCorrect() {
        return quantity > 0 && price > 0;
    }

    public void print (String productName, int quantity, double price) {
        System.out.println(productName + "|" + price + " | " + quantity + " | " + getAmount());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderItem orderItem)) return false;
        return quantity == orderItem.quantity && Double.compare(orderItem.price, price) == 0 && Objects.equals(productName, orderItem.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, quantity, price);
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "productName='" + productName + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
