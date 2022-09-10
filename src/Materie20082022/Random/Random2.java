package Materie20082022.Random;

import java.util.Random;

public class Random2 {
    public static void main(String[] args) {
        Random random = new Random();
        int nr = random.nextInt(100);
        System.out.println(nr);
        if (nr < 10) {
            System.out.println("Numar mic");
        } else if (nr < 50) {
            System.out.println("Numar mediu");
        } else if (nr < 100) {
            System.out.println("Numar mare");
        }
    }
}
