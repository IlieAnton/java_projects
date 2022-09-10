package Materie20082022.AlteMiciPrograme;

import java.util.Scanner;

public class Tema19a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nr = scanner.nextDouble();
        // 123,45
        int convertit = (int) nr;
        int ultimaCifra = convertit % 10;
        System.out.println(ultimaCifra);
    }
}
