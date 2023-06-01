package org.snacks.java;

import java.util.Scanner;

public class Snack1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;

        System.out.println("Inserisci un numero: ");
        number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " e' un numero pari.");
        } else {
            int alternativeNumber = number + 1;
            System.out.println("Devi inserire un numero pari! Ecco a te un numero pari, successivo al numero che hai inserito: " + alternativeNumber);
        }
    }
}
