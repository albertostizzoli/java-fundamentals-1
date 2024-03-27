package org.experis.food;

public class FavouriteFood {
    public static void main(String[] args) {
        // Array contenente i cibi preferiti
        String[] foods = {"Pizza", "Pasta", "Sushi", "Hamburger", "Gelato", "Tiramisù"};
        // Lunghezza dell'array dei cibi
        int foodLength = foods.length;

        // Stampare il numero di cibi nella classifica
        System.out.println("Ecco quanti cibi ci sono in classifica: " + foodLength + " cibi");

        // Stampare il cibo preferito (il primo elemento dell'array)
        System.out.println("Il mio cibo preferito è: " + foods[0]);

        // Stampare il cibo che si trova all'ultimo posto nella classifica
        System.out.println("Quello che mi piace di meno è: " + foods[foodLength - 1]);

        // Stampare il cibo che si trova a metà classifica (arrotondando verso il basso se la lunghezza è dispari)
        System.out.println("Il cibo che c'è a metà classifica è: " + foods[foodLength / 2]);


    }
}
