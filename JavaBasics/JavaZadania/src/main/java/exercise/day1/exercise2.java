package exercise.day1;

import java.util.Scanner;

public class exercise2 {

   // private static final float PI = 3.14F;
    private static final double PI = 3.14F;

    public static void main (String[] args) {
        float radius = getUserDiameter()/2;
        System.out.println("Radius = " + radius);
        float circumference = calculateCircumferenceOfCircle(radius);
        System.out.println("Circumference = " + circumference);
        float area = calculateAreaOfCircle(radius);
        System.out.println("Area = " + area);

    }

    private static float getUserDiameter (){
        Scanner scan = new Scanner (System.in);
        System.out.println("Please insert the diameter:");
        return scan.nextFloat();

    }

    private static float calculateCircumferenceOfCircle(float radius) {
        // 2 * pi * radius
        return 2 * (float)(PI * Math.pow(radius, 2));
    }

    private static float calculateAreaOfCircle(float radius) {
        // pi * radius^2
        return (float)PI * radius * radius;
    }
}
