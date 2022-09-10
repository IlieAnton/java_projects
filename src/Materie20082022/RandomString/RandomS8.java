package Materie20082022.RandomString;

import java.util.Random;

public class RandomS8 {
    public static void main(String[] args) {
        String[] c = {"acuarela", "Luneta", "baza"};
        int len = c.length;
        Random r = new Random();
        int nr = r.nextInt(len);
        if (c[nr].startsWith("b")) {
            System.out.println("Da, incepe");
        } else {
            System.out.println("Nu, nu incepe");
        }
    }
}
