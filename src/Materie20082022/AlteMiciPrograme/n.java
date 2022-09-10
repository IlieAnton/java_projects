package Materie20082022.AlteMiciPrograme;

import java.util.Scanner;

public class n {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int afis = 0;
       // System.out.println(1);
        for (int i = 1; i <= n; i = i+1 ) {
            afis = afis * 10 + i;
            System.out.println(afis);
        }
    }
}
