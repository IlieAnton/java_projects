package Materie20082022.RandomString;

import java.util.Random;

public class RandomS6 {
    public static void main(String[] args) {
        Random random = new Random();
        String cuvinte[] = {"Casa", "masa", "Paine", "mare", "munte"};
        int len = cuvinte.length;
        int nr = random.nextInt(len);
        if (cuvinte[nr].length() %2 == 0) {
            System.out.println("Lungimea este para");
        }else {
            System.out.println("Lungimea este impara");
        }
    }
}
