package Materie20082022.AlteMiciPrograme;

import java.util.Scanner;

public class Teme {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int nr = scanner.nextInt();
        if (nr %2 == 0 ) {
            System.out.println(nr + " este un Materie20082022.AlteMiciPrograme.numar par");
        }else {
            System.out.println(nr + " este un Materie20082022.AlteMiciPrograme.numar impar");
        }
    }
}