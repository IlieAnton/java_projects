package Materie20082022.RandomString;

import java.util.Random;

public class RandomS7 {
    public static void main(String[] args) {
    String cuvinte[] = {"Mere","pere","banane","Prune"};
    char c = 'a';
    int len = cuvinte.length;
        Random r = new Random();
        int nr = r.nextInt(len);
        if (cuvinte[nr].contains("a")) {
            System.out.println("Da, contine");
        } else {
            System.out.println("Nu, nu contine");
        }
    }
}
