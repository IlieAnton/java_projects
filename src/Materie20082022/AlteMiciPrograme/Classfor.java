package Materie20082022.AlteMiciPrograme;

import java.util.Scanner;

public class Classfor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nr = 123;
        int nr1 = nr % 10;
        System.out.println(nr1);
        nr = nr / 10;
        int nr2 = nr % 10;
        System.out.println(nr2);
        nr = nr / 10;
        System.out.println(nr);
        System.out.println(nr1 + nr2 + nr);

    }
}
