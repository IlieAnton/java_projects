package Materie20082022.AlteMiciPrograme;

import java.util.Scanner;

public class n2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int produs = 1;
        for (int i = 1; i <= n; i = i + 1) {
            sum = sum + i;
            produs = produs * i;

        }
        System.out.println(sum);
        System.out.println(produs);
    }
}

