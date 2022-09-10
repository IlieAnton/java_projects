package Materie20082022.AlteMiciPrograme;

import java.util.Scanner;

public class pare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nr = scanner.nextInt();
        for (int i = 1; i <= nr; i = i + 1) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
