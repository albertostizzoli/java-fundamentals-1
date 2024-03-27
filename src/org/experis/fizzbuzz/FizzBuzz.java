package org.experis.fizzbuzz;

public class FizzBuzz {
    public static void main(String[] args) {
        // Ciclo da 1 a 100
        for (int i = 1; i <= 100; i++) {
            // Controlla se i è multiplo sia di 3 che di 5
            if (i % 3 == 0 && i % 5 == 0) {
                // Se multiplo di entrambi, stampa FizzBuzz
                System.out.println("FizzBuzz");
            }
            // Controlla se i è multiplo di 3
            else if (i % 3 == 0) {
                // Se multiplo di 3, stampa Fizz
                System.out.println("Fizz");
            }
            // Controlla se i è multiplo di 5
            else if (i % 5 == 0) {
                // Se multiplo di 5, stampa Buzz
                System.out.println("Buzz");
            }
            // Se non è multiplo di 3 o di 5, stampa il numero stesso
            else {
                System.out.println(i);
            }
        }
    }
}


