package Materie20082022.Random;

import java.util.Random;
import java.util.Scanner;



public class Random4 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int nr = random.nextInt(100);
        System.out.println(nr);
        for (int a = 1; a <= 5; a = a + 1) {
            System.out.println("Introdu Numarul tau.");
            int nr1 = scanner.nextInt();
            int a1 = nr - 1;
            int a2 = nr + 1;
            if (nr1 == nr) {
                System.out.println("L-ai ghicit");
                System.out.println("Ai castigat din " + a + " Incercari");
                break;

            } else if (nr1 == a1) {
                System.out.println("BOOM!");
                break;
            } else if (nr1 == a2) {
                System.out.println("BOOM!");
                break;
            }
            else if (nr1 < nr) {
                System.out.println("Mai Mare");
            } else if (a == 5) {
                System.out.println("Nu ai castigat");
            } else if (nr1 > nr) {
                System.out.println("Mai mic");
            } if (a == 5) {
                System.out.println("Nu ai castigat");
            }
        }
    }
}

