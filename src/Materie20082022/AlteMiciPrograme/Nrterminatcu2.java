package Materie20082022.AlteMiciPrograme;

import java.util.Scanner;

public class Nrterminatcu2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nr = scanner.nextInt();
        for (int a = 0; a <= nr; a = a+1) {
            if (a %10 == 2) {
                System.out.println(a);
            }
        }
    }
}
