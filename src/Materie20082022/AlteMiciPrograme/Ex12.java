package Materie20082022.AlteMiciPrograme;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nr = scanner.nextInt();
        System.out.println(nr/100%10);
        System.out.println(nr/10%10);
        System.out.println(nr%10);
        System.out.println(nr/100%10 == nr/10%10 && nr/10%10 == nr%10);
    }
}
