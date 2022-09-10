package Materie20082022.Exfor;

import java.util.Scanner;

public class Exfor2 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        int nr = scanner.nextInt();
        for (int a = 0; a <= nr; a=a+1) {
            sum = sum + a;

        }
        System.out.println(sum);
    }
}
