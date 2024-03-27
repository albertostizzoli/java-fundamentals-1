package org.experis.train;

import java.util.Scanner;

public class TicketTrain {
    public static void main(String[] args){
        // Creo lo Scanner per acquisire l'input dell'utente
        Scanner scanner = new Scanner(System.in);

        // Chiedo all'utente quanti km vuole percorrere
        System.out.print("Inserisci il numero di km che vuoi percorrere: ");
        int km = scanner.nextInt();

        // Chiedo all'utente di inserire l'età del passeggero
        System.out.print("Inserisci l'età del passeggero: ");
        int eta = scanner.nextInt();

        // Definiamo il prezzo per chilometro
        double priceKm = 0.21;
        // Calcoliamo il prezzo totale del viaggio basato sui km inseriti e il prezzo per chilometro
        double totalPrice = km * priceKm;

        if (eta < 18) {
            // Applico lo sconto del 20% per i minorenni
            totalPrice -= totalPrice * 0.20;
        } else if (eta >= 65) {
            // Applica lo sconto del 40% per gli over 65
            totalPrice -= totalPrice * 0.40;
        }

        // Stampo il prezzo totale del viaggio
        System.out.println("Il prezzo totale del viaggio è: " + totalPrice + " €");

        // Chiudo lo scanner
        scanner.close();

    }
}
