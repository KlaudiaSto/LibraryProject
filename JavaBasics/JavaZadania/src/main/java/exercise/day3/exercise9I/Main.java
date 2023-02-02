package exercise.day3.exercise9I;

public class Main {

    public static void main (String [] args){

        OrderItem orderItem1 = new OrderItem("Cukier", 3, 12.00);

        System.out.println(orderItem1.getAmount());
        System.out.println(orderItem1.isCorrect());

        Order order = new Order(5);

    }
}
