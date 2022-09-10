package Materie20082022.RandomString;

import java.util.Random;

public class RandomS9 {
    public static void main(String[] args) {
        String[] c = {"Mancare", "bautura", "Suc", "ab"};
        int len = c.length;
        Random r = new Random();
        int nr = r.nextInt(len);
        if (c[nr].startsWith("a") && c[nr].endsWith("b")) {
            System.out.println("Da, incepe cu a si se termina cu b");
        } else {
            System.out.println("Nu, nu incepe cu a si nu se termina cu b");
        }
    }
}
