package exercise.day1;

import javax.print.attribute.IntegerSyntax;
import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {


        System.out.println("Please provide integer x:");
        int x = getUserIntegers();
        System.out.println("Please provide integer x:");
        int y = getUserIntegers();

        methodforPointA(x, y);
        methodforPointB(x, y);
        methodforPointC(x, y);
        methodforPointD(x, y);

    }

    private static int getUserIntegers() {
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    private static void methodforPointA(int x, int y){
        boolean result = x > y;
        System.out.println("If x is greater than y: " + result);
    }

    private static void methodforPointB(int x, int y){
        boolean result = x*3 > y;
        System.out.println("If x multiplied by 3 is greater than y: " + result);
    }

    private static void methodforPointC(int x, int y) {
        boolean result = (y++ < ++x) && (--x < y++);
        System.out.println("If (y++ < ++x) && (--x < y++): " + result);
    }

    private static void methodforPointD(int x, int y) {
        boolean result = (x * y) %2 == 0;
        System.out.println("If (x * y) %2 == 0" + result);

    }

}
