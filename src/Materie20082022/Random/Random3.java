package Materie20082022.Random;

import java.util.Random;
import java.util.Scanner;

public class Random3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nr = scanner.nextInt();
        Random random = new Random();
        for (int a = 1; a <= nr; a = a + 1) {
            int nr1 = random.nextInt(10);
            System.out.println(nr1);
            if (nr1 < 8) {
                System.out.println("Este o nota mica");
            } else {
                System.out.println("Este o nota mare");
            }
        }
    }
}
