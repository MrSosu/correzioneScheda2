public class Esercizio2 {

    /*
    Scrivere un metodo che, data una stringa s in input, ne stampi il reverse,
    ossia la stringa al contrario. Esempio: data la stringa «ciao», dovrà stampare «oaic».
     */
    public static void reverseString(String s) {
        String sReverse = "";
        for (int i = s.length()-1; i >= 0; i--) {
            sReverse += s.charAt(i);
        }
        System.out.println("La stringa rigirata è: " + sReverse);
    }

    public static void reverseString2(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        System.out.println("La stringa rigirata è: " + stringBuilder.reverse());
    }

}
