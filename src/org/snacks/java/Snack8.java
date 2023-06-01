package org.snacks.java;

import java.util.Scanner;

public class Snack8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean validNumber = false;

        int number;

        do {
            System.out.println("insert a 4 digit number: ");
            number = scanner.nextInt();
            if (number > 999 && number < 10000) {
                validNumber = true;
            }
        } while (!validNumber);

        System.out.println("your number is: " + number);

        int sum = 0;
        int tempNumber = number;

        while (tempNumber > 0) {
            int digit = tempNumber % 10;
            sum += digit;
            tempNumber /= 10;
        }

        System.out.println("The sum of the digits is: " + sum);

        scanner.close();
    }
}
