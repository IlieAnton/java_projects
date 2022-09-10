package Materie20082022.AlteMiciPrograme;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int nr = scanner.nextInt();
        int nr1 = nr % 10;

        nr = nr / 10;
        int nr2 = nr % 10;
        int nr3 = nr / 10;
        System.out.println(nr1);
        System.out.println(nr2);
        System.out.println(nr3);
    }
}
