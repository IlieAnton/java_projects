package Materie20082022.AlteMiciPrograme;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int nr = scanner.nextInt();
        int nr1 = scanner.nextInt();
        if (nr < nr1) {
            System.out.println(nr1 + " este mai mare");
        } else {
            System.out.println(nr + "este mai mare");
        }
    }
}
