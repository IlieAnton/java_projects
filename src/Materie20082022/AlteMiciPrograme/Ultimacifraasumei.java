package Materie20082022.AlteMiciPrograme;

import java.util.Scanner;

public class Ultimacifraasumei {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nr = scan.nextInt();
        int nr1 = scan.nextInt();
        int sumnr = nr + nr1;
        sumnr = sumnr % 10;
        //  sumnr = sumnr 10;
        System.out.println(sumnr);
    }
}
