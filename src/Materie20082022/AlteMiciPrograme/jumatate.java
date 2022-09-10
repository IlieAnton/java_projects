package Materie20082022.AlteMiciPrograme;

import java.util.Scanner;

public class jumatate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nr = scanner.nextInt();
       // int nr2 = nr / 2;
        for(int nr2 = nr / 2; nr2 <= nr; nr2 = nr2+1) {
            System.out.println(nr2);
        }
    }
}
