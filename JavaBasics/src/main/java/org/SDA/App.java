package org.SDA;

import java.awt.font.FontRenderContext;
import java.util.Scanner;

// comment
/*
multiline
comment
String to dane tekstowe / w java tylko jeden typ danych do określenia / musimy nadać zmiennej nazwę
 */
public class App {
    public static void main(String[] args) {
        /*
        String lineToPrint = "Name Test";//define string variable called lineToPrint and assigned value "Name Test"
        System.out.println("Hello World");//Invoke method println with parameter "Hello World" - wywoujemy metodę
        System.out.println("Hello SDA");//Invoke method println with parameter "Hello SDA"
        System.out.println(lineToPrint);//Invoke method println with parameter lineToPrint
        lineToPrint = "Good job";//Change lineToPrint value to "Good Job"
        System.out.println(lineToPrint);//Invoke method println with parameter lineToPrint
        String newTest ="Hope";//define string variable called newTest and assigned value "Hope"
        System.out.println(newTest);//Invoke method println with parameter newTest

        String hello = "Hello ";//define string variable called hello and assigned value "Hello"
        String name = "Klaudia";//define string variable called name and assigned value "Klaudia"
        System.out.println(hello + name);//Invoke method println with parameter hello concatenated to name


         */

        /*
        Integer a = 10;//define integer variable called a
        Integer b = 11;//define integer variable called b
        Integer add = a + b;//add value a + add value b
        Integer sub = a - b;//substract value b from value a
        Integer mult = a * b;//multiply values a and b
        Integer div = a / b;//divide value a by b
        System.out.println("a: "+a.toString());//
        System.out.println(b);
        System.out.println(add);
        System.out.println(sub);
        System.out.println(mult);
        System.out.println(div);

        Double x = 2.5;
        Double y = 3.7;
        Double dAdd = x + y;
        Double dSub = x - y;
        Double dMult = x * y;
        Double dDiv = x/y;
        System.out.println(x);
        System.out.println(y);
        System.out.println(dAdd);
        System.out.println(dSub);
        System.out.println(dMult);
        System.out.println(dDiv);

         */

        /*

        Boolean isUnderAge = true;
        Boolean isMale = false;

        if (isUnderAge == true) { //if isUnderAge is equal to true than execute line 63
            System.out.println("Is under age is true");
        }
        else {
            System.out.println("is under age is false");



        Integer age = 91;

        if (age >= 18) {
            if (age >= 90) {
                System.out.println("Take it easy, Grandpa");
            }
            else {
                System.out.println("Here is your beer");
            }
        } else {
            if (age < 12) {
                System.out.println("Where are your parents, kid?");
            } else {
                System.out.println("Get out of here!");
            }
        }




        Integer age = 30;

        if (age > 90){
            System.out.println("Take it easy, Grandpa");
        }
        else if (age >=18) {
            System.out.println("Here is your beer");
        }
        else if (age > 12){
            System.out.println("Get out of here!");
        }
        else {
            System.out.println("Where are your parents, kid?");
        }

    }
}



        Integer number = 0;

        //if - else if - else - condition chain

        if (number == 0){
            System.out.println("Zero");
        }
        else if (number == 1){
            System.out.println("One");
        }
        else if (number == 2){
            System.out.println("Two");
        }
        else if (number == 3){
            System.out.println("Three");
        }
        else if (number == 4){
            System.out.println("Four");
        }
        else if (number == 5){
            System.out.println("Five");
        }
        else if (number == 6){
            System.out.println("Six");
        }
        else if (number == 7){
            System.out.println("Seven");
        }
        else if (number == 8){
            System.out.println("Eight");
        }
        else if (number == 9){
            System.out.println("Nine");
        }
        else {
            System.out.println("I don't Know");
        }

        //switch statement
        switch (number){
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            default:
                System.out.println("I don't Know");
                break;
        }

        //switch expression
        String message = switch (number){
            case 0 -> "Zero";
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            case 4 -> "Four";
            case 5 -> "Five";
            case 6 -> "Six";
            case 7 -> "Seven";
            case 8 -> "Eight";
            case 9 -> "Nine";
            default -> "I don't Know";

        };
        System.out.println(message);



        Integer number = 3;
        if ( number % 2 == 0 ) {
            System.out.println(number + " is an even number.");
        }
        else {
            System.out.println(number +" is an odd number.");
        }


        Int.range(0, 2).forEach($ -> if ( number % 2 == 0 ) {
            System.out.println(number + " is an even number.");
        }
        else {
            System.out.println(number +" is an odd number.");
        })

double pow = Math.pow(a,b);
        System.out.println("Result:" + pow);


        */


        Scanner scanner = new Scanner(System.in);

        System.out.println("Base");
        Integer a = scanner.nextInt();

        System.out.println("Exp");
        Integer b = scanner.nextInt();

        Integer count = b;
        while (b > count) {

            Integer mult = a * b;
            System.out.println("Result: " + mult);
            count++;
        }
        System.out.println();

/*

Zadania do Pair Programmingu:

    Korzystając z pętli, zaimplementuj potęgowanie dla dowolnej pary liczb całkowitych (x do potęgi y)
    Korzystając z pętli, zaimplementuj obliczanie silni dla dowolnej liczby całkowitej
    FizzBuzz - Korzystając z pętli, zaimplementuj odliczanie od 1 do 100. Jeżeli liczba jest podzielna przez trzy, napisz Fizz. Jeżeli liczba jest podzielna przez 5, napisz Buzz. Jeżeli liczba jest podzielna przez 3 i przez 5, napisz FizzBuzz. W innym przypadku wypisz tą liczbę. Np: 1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz
    [EXTRA] Korzystając z pętli, zaimplementuj ciąg Fibonacciego dla dowolnej liczby całkowitej.

// Power
Scanner scanner = new Scanner(System.in); // Initialize scanner object, which receives user input
System.out.println("Provide x"); // Ask the user for input
Integer x = scanner.nextInt(); // Get integer inputted by the user
System.out.println("Provide y"); // Ask the user for input
Integer y = scanner.nextInt(); // Get integer inputted by the user

// x to power of y
Integer count = 1; // Start loop countdown at 1
Integer power = 1; // Start power result at 1 (x^0=1)

while (count <= y) { // check if the amount of loop repetitions has exceeded y
    power *= x; // result = result * x; multiplicative assignment
    count++; // count = count + 1; post-incrementation
}

System.out.println(power); // print out the result

// Factorial
// factorial a! = a * (a-1) * (a-2) * ... * 1
// 4! = 4 * 3 * 2 * 1 = 24
System.out.println("Provide a"); // Ask the user for input
Integer a = scanner.nextInt(); // Get integer inputted by the user
count = 1; // Start loop countdown at 1
Integer factorial = 1; // Start factorial result at 1 (1!=1)

while (count <= a) { // check if amount of loop repetitions has exceeded a
    factorial *= count; // multiply previous factorial by current number
    count++; // post-incrementation of count
}

System.out.println(factorial); // print out the result

// FizzBuzz
count = 1; // start fizzbuzz countdown at 1
while (count <= 100) { // fizzbuzz countdown until exceeding 100
    if (count % 15 == 0) { // if count is divisible by 15, then FizzBuzz
        System.out.println("FizzBuzz");
    }
    else if (count % 3 == 0) { // if count is divisible by 3, then Fizz
        System.out.println("Fizz");
    }
    else if (count % 5 == 0) { // if count is divisible by 5, then Buzz
        System.out.println("Buzz");
    }
    else { // in all other scenarios, display the number
        System.out.println(count);
    }

    count++; // post-increment count
}

// Fibonacci
// 0, 1, 1, 2, 3, 5...
// f(n) = f(n-1) + f(n-2)
System.out.println("Provide n"); // Ask the user for input
Integer n = scanner.nextInt(); // Get integer inputted by the user

Integer f1 = 0; // f1 is the first fibonacci value, which is always zero
Integer f2 = 1; // f2 is the second fibonacci value, which is always one

if (n == 1) { // if n==1, then f1
    System.out.println(f1);
}
else if (n == 2) { // if n==2, then f2
    System.out.println(f2);
}
else { // calculate fibonacci number
    count = 3; // initialize count at 3, because 1 and 2 are covered above
    Integer f = 0; // initialize f variable (zero value is temporary)
    Integer fPrevious = f2; // initialize variable for storing the previous fibonacci number
    Integer fPreviousPrevious = f1; // initialize variable for storing the second-previous fibonacci number

    while (count <= n) { // count down until exceeding n
        f = fPreviousPrevious + fPrevious; // calculate fibonacci number by summing the previous two numbers
        fPreviousPrevious = fPrevious; // store the previous value for future calculation
        fPrevious = f; // store the current value for future calculation

        count++; // post-increment count
    }
    System.out.println(f); // display fibonacci number
}


 */

        // FOR // (zmienna licznika; warunek; iterator)


// for (INICJALIZACJA LICZNIKA; WARUNEK; ITERATOR)

        for (Integer i = 0; i <= 100; i++) {
            System.out.println(i);
        }
    }
}
