package org.example;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    // Function designed to print sum, difference, product, and quotient of two user-given integers.
    // Does not work properly with decimals
    // Division will round down to nearest whole number if decimal answer.
    public static void main( String[] args )
    {
        String numOne, numTwo;
        int first, second;

        System.out.println("What is the first number?");
        Scanner inputFirst = new Scanner(System.in);
        numOne = inputFirst.nextLine();

        System.out.println("What is the second number?");
        Scanner inputSecond = new Scanner(System.in);
        numTwo = inputSecond.nextLine();

        first = Integer.parseInt(numOne);
        second = Integer.parseInt(numTwo);

        System.out.println(first + " + " + second + " =  " + (first + second));
        System.out.println(first + " - " + second + " =  " + (first - second));
        System.out.println(first + " * " + second + " =  " + (first * second));
        System.out.println(first + " / " + second + " =  " + (first / second));

    }
}
