package Materie20082022.AlteMiciPrograme;

import java.util.Scanner;

public class nrpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nr =scanner.nextInt();
        if (nr % 2 == 0) {
            System.out.println(nr);
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }
    }
}

