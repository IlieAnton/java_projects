package Materie20082022.RandomString;

import java.util.Random;

public class RandomS1 {
    public static void main(String[] args) {
        String[] cuvinte = {"Mare", "Mic", "Mediu"};
        int len = cuvinte.length;
        Random r = new Random();
        int nr = r.nextInt(len);
        System.out.println(nr);
        System.out.println(cuvinte[nr]);

    }
}
