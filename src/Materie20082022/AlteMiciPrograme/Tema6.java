package Materie20082022.AlteMiciPrograme;

import java.util.Scanner;

public class Tema6 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        int a = scanner1.nextInt();
        int nr1 = a /10;
        System.out.println(nr1);
        int nr2 = a %10;
        System.out.println(nr2);
        System.out.println(nr1+nr2);
    }
}
