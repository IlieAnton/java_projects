package Materie20082022.For;

public class Forex5 {
    public static void main(String[] args) {
        String a = "Ana are mere rosii";
        int a1 = a.length();
        int spatii = 0;
        for (int b = 0; b <= a1 - 1; b = b + 1) {
            if (a.charAt(b) == ' ') {
                spatii = spatii + 1;
            }
        }
        System.out.println(spatii + " spatii");
        int cuvinte = spatii + 1;
        System.out.println(cuvinte + " cuvinte");

    }
}
