package Materie20082022.AlteMiciPrograme;

import java.util.Scanner;

public class nrimparepanela {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int nr = S.nextInt();
        for (int a = 0; a <= nr; a = a + 1) {
            if (a % 2 == 1) {
                System.out.println(a);
            }
        }
    }
}
