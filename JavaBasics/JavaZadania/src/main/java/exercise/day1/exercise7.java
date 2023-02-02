package exercise.day1;

public class exercise7 {

    public static void main(String[] args) {

        float x = 46;
        float y = 60;
        String operator = "*";

        switch (operator) {
            case "+":
                System.out.println(x + " + " + y + " = " + (x + y));
                break;
            case "-":
                System.out.println(x + " - " + y +" = " + (x - y));
                break;
            case "/":
                System.out.println(x + " / " + y + " = " + (x / y));
                break;
            case "*":
                System.out.println(x + " * " + y + " = " + (x * y));
                break;
            default:
                System.out.println("Operator does not exist");
        }
    }
}
