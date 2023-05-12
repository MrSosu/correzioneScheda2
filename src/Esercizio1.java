import java.util.Scanner;

public class Esercizio1 {

    /* Scrivere un metodo che, dato un char a e una stringa b, stampa il numero di occorrenze di a in b. */
    // metodo = funzione definita all'interno di una classe
    public static void contaOccorrenze(char a, String b) {
        int result = 0;
        for (int i = 0; i < b.length(); i++) {
            char myChar = b.charAt(i);
            if (myChar == a) {
                result++;
            }
        }
        System.out.println("Il numero di occorrenze di " + a + " in " + b + " è: " + result);
    }

}
