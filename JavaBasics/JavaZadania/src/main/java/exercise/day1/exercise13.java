package exercise.day1;

import java.util.Scanner;

public class exercise13 {

    public static void main (String [] args){

        Scanner scanner = new Scanner (System.in);
        int i;
        System.out.println("Enter 0 to Exit");
        do {
            System.out.println("Please provide an integer: ");
            i = scanner.nextInt();
        }
        while (i != 0);
    }
}
