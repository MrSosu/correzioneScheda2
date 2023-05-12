public class Main {

    public static void main(String[] args) {
        Esercizio2.reverseString2("Marco Adriani");
        String s = "java developer";
        s = s.toUpperCase();
        System.out.println(s);
        System.out.println(Esercizio3.isPrime(2));
        System.out.println(Esercizio4.fattoriale(8));
        System.out.println(Esercizio4.fattorialeRicorsivo(8));
        System.out.println(Esercizio5.sommaArmonica(100));
        System.out.println(Esercizio5.sommaArmonicaRicorsiva(100));
        System.out.println(Esercizio6.palindroma("abcdefedcba"));
        System.out.println(Esercizio6.palindromaLazy("abcdefedcba"));
    }

}
