package Materie20082022.For;

public class Forex7 {
    public static void main(String[] args) {
        String a = "Ana are pere";
        int Lungime = a.length();
        char a2 = a.charAt(Lungime-1) ;
        int U = 0;
        for (int b = 0; b <= Lungime - 1; b = b + 1) {
            if (a.charAt(b) == a2) {
                U = U + 1;

            }
        }
        System.out.println("Ultimul caracter se repeta de " + U + " ori");
    }
}
