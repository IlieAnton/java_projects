package Materie20082022.Timp;

import java.util.Random;

public class Timp4 {
    public static void main(String[] args) throws InterruptedException {
        Random r = new Random();
        int r1 = r.nextInt(1000);
        System.out.println("Se genereaza primul nr.");
        Thread.sleep(2 * 1000);
        int r2 = r.nextInt(100);
        System.out.println("Se genereaza al doilea nr.");
        Thread.sleep(3 * 1000);
        System.out.println("Se aduna cele doua nr.");
        System.out.println(r1 + r2);
        Thread.sleep(3 * 1000);
        System.out.println("Se scad cele doua nr.");
        System.out.println(r1 - r2);
        Thread.sleep(3 * 1000);
        System.out.println("Se inmultesc cele doua nr.");
        System.out.println(r1 * r2);
        Thread.sleep(3 * 1000);
        System.out.println("Se impart cele doua nr.");
        System.out.println(r1 / r2);
        Thread.sleep(3 * 1000);
        System.out.println("Cele doua nr. sunt:");
        Thread.sleep(1000);
        System.out.println(r1);
        Thread.sleep(1000);
        System.out.println(r2);
    }
}
