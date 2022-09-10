package Materie20082022.For;

import java.util.Scanner;

public class Forex4 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String nr = scanner.nextLine();
        int nr1 = nr.length()-1;
        for (int a=nr1; a >= 0; a = a-1) {
            System.out.println(nr.charAt(a));
        }
    }
}
