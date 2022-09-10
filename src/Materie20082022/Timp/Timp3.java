package Materie20082022.Timp;

import java.util.Random;

public class Timp3 {
    public static void main(String[] args) throws InterruptedException {
        Random r = new Random();
        int r1 = r.nextInt(100);
        Thread.sleep(6 * 1000);
        System.out.println(r1);
    }
}
