package Materie20082022.AlteMiciPrograme;

import java.util.Scanner;

public class invers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nr = scanner.nextInt();
        for (int nr2 = nr; nr2 > 0; nr2 = nr2- 1) {
            System.out.println(nr2);
        }
    }
}
