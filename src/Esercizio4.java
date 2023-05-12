public class Esercizio4 {

    /*
    Scrivere un programma che, dato un intero n in input, ne calcoli il fattoriale.
     */
    public static int fattoriale(int n) {
        n = Math.abs(n);
        if (n < 2) return 1;
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    /*
    5! = 5*4*3*2*1 = 5*4!
     */
    public static int fattorialeRicorsivo(int n) {
        n = Math.abs(n);
        // caso base
        if (n < 2) return 1;
        // caso generale
        else return n*fattorialeRicorsivo(n-1);
    }

}
