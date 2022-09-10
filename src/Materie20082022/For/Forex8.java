package Materie20082022.For;

public class Forex8 {
    public static void main(String[] args) {
        String a = "mircea are mere";
        char char1 = a.charAt(0);
        int Lungime = a.length();
        int E = 0;
        for (int b = 0; b <= Lungime - 1; b = b + 1) {
            if (a.charAt(b) == char1) {
                E = E + 1;

            }
        }
        System.out.println("Primul caracter se repeta de " + E + " ori");
    }
}
