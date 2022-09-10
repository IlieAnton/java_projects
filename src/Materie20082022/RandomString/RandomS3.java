package Materie20082022.RandomString;

import java.util.Random;

public class RandomS3 {
    public static void main(String[] args) {
        String[] cuvinte = {"Mici", "Mic", "Not"};
        int len = cuvinte.length;
        Random r = new Random();
        int nr = r.nextInt(len);
        if (cuvinte[nr].length() % 2 == 0) {
            System.out.println("Este par");
        } else {
            System.out.println("Este impar");
        }
    }
}
