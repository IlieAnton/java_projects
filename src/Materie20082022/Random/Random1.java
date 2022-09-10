package Materie20082022.Random;

import java.util.Random;

public class Random1 {
    public static void main(String[] args) {
        Random r = new Random();
        int nr = r.nextInt(100);
        System.out.println(nr);
    }
}
