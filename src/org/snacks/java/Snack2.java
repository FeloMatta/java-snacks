package org.snacks.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Snack2 {
    public static void main(String[] args) {
        List<String> nomi = new ArrayList<>();
        nomi.add("Jay");
        nomi.add("Daisy");
        nomi.add("Tom");
        nomi.add("Jordan");
        nomi.add("Nick");

        List<String> cognomi = new ArrayList<>();
        cognomi.add("Gatsby");
        cognomi.add("Buchanan");
        cognomi.add("Wilson");
        cognomi.add("Carraway");
        cognomi.add("Baker");

        int numeroInvitati = 10;

        Random random = new Random();

        System.out.println("Lista degli invitati:");

        for (int i = 0; i < numeroInvitati; i++) {
            String nomeCasuale = nomi.get(random.nextInt(nomi.size()));
            String cognomeCasuale = cognomi.get(random.nextInt(cognomi.size()));
            System.out.println((i + 1) + ". " + nomeCasuale + " " + cognomeCasuale);
        }
    }
}
