package Materie20082022.Timp;

import java.util.Scanner;

public class Timp2 {
    public static void main(String[] args) throws InterruptedException {
        Scanner s = new Scanner(System.in);

        Thread.sleep(1*3000);
        System.out.println("Prenumele?");
        String s1 = s.nextLine();

        Thread.sleep(2*1000);
        System.out.println("Se proceseaza...");
        Thread.sleep(2*1000);
        System.out.println("Numele?");
        String s2 = s.nextLine();
        Thread.sleep(2*1000);
        System.out.println("Se proceseaza...");
        Thread.sleep(2*1000);
        System.out.println("varsta?");
        String s3 = s.nextLine();
        Thread.sleep(2*1000);
        System.out.println("Se proceseaza...");
        Thread.sleep(2*1000);
        System.out.println("Procesat cu succes");

        System.out.println("Date:");
        Thread.sleep(3*1000);
        System.out.println(s1);
        Thread.sleep(3*1000);
        System.out.println(s2);
        Thread.sleep(3*1000);
        System.out.println(s3);
    }
}
