package Materie20082022.AlteMiciPrograme;

import java.util.Scanner;

public class Problema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String a = "";
        //    System.out.println("Cuvant" + 3);
        for (int i = 1; i <= n; i = i + 1) {
            //System.out.println(a + i);
            a = a + i;
            System.out.println(a);
        }
    }
}
