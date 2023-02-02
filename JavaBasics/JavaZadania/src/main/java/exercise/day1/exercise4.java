package exercise.day1;

import java.util.Scanner;

public class exercise4 {

    private static final float BMImin = 18.5F;
    private static final float BMImax = 24.5F;

    public static void main(String[] args) {

        float weight = getUserWeight();
        int height = getUserHeight();
        float BMI = calculateBMI(weight, height);
        displayBMIresult(BMI);
    }

    private static float getUserWeight() {
        System.out.println("Please provide your weight [kg]: ");
        Scanner scan = new Scanner(System.in);
        return scan.nextFloat();
    }

    private static int getUserHeight() {
        System.out.println("Please provide your height [cm]: ");
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    private static float calculateBMI (float weight, int height){
        float heightInMeter = height / 100F;
        return weight / (heightInMeter*heightInMeter);
    }

    private static void displayBMIresult (float BMI){
        if (BMI >= BMImin && BMI <= BMImax){
            System.out.println("BMI is correct: " + BMI);
        }
        else {
            System.out.println("BMI is incorrect: " + BMI);
        }
    }
}
