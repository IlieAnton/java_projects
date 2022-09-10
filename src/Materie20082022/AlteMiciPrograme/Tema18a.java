package Materie20082022.AlteMiciPrograme;

import java.util.Scanner;

public class Tema18a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nr = scanner.nextInt();
        int nr1 = nr % 10;
        System.out.println(nr1);
        int nr2 = nr /10;
        System.out.println(nr2);
        int ambeleNr = nr2+nr1;
        System.out.println(ambeleNr);
    }
}
