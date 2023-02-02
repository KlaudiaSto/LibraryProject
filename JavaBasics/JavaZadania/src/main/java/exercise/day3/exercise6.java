package exercise.day3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class exercise6 {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide the end date [MM/dd/yyyy HH:mm:ss]");
        String inputDate = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        LocalDateTime parse = LocalDateTime.parse(inputDate, formatter);
        System.out.println(parse);

        LocalDateTime.now();
        //Duration duration = Duration.between(now,

    }
}
