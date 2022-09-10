package Materie20082022.RandomString;

import java.util.Random;

public class RandomS2 {
    public static void main(String[] args) {
        String[] cuvinte = {"Cuvant", "Cuvinte", "Cuvintel"};
        int len = cuvinte.length;
        Random r = new Random();
        int nr = r.nextInt(len);
        System.out.println(cuvinte[nr]);
        int nr1 = r.nextInt(len);
        System.out.println(cuvinte[nr1]);
    }
}
