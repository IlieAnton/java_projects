package Materie20082022.AlteMiciPrograme;

import java.util.Scanner;

public class Tema20a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nr = scanner.nextDouble();
        // 123.45
        double a = nr * 10;
        System.out.println(a);
        int b = (int) a;
        System.out.println(b);
        int c = b %10;
        System.out.println(c);
    }
}
