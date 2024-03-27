package org.experis.bonus;

import java.util.Scanner;

public class CheckParty {
    public static void main(String[] args){
        // Array contenente i nomi degli invitati
        String[] guests = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

        // Scanner per l'input dell'utente
        Scanner scanner = new Scanner(System.in);
        System.out.println("Benvenuto alla festa");
        System.out.print("Il tuo nome? ");
        String name = scanner.nextLine();

        // Verifico se il nome è presente nella lista degli invitati
        boolean invited = false;
        for (int i = 0; i < guests.length; i++) {
            if (guests[i].equalsIgnoreCase(name)) {
                invited = true;
                break;
            }
        }

        // La condizione determina se consentire l'accesso o no
        if (invited) {
            System.out.println("Benvenuto alla festa!");
        } else {
            System.out.println("Mi dispiace, ma non sei sulla lista degli invitati. Te ne devi andare.");
        }
        // Chiudo lo scanner
        scanner.close();
    }
}

