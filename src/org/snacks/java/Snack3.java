package org.snacks.java;

public class Snack3 {
    public static void main(String[] args) {
        int[] numeri = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int somma = 0;

        for (int i = 0; i < numeri.length; i++) {
            if ((i + 1) % 2 != 0) {
                somma += numeri[i];
            }
        }

        System.out.println("La somma degli elementi in posizione dispari e': " + somma);
    }
}
