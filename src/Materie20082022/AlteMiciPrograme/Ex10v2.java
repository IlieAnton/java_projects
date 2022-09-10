package Materie20082022.AlteMiciPrograme;

import java.util.Scanner;

public class Ex10v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nr = scanner.nextInt();
        int ultimaCifra = nr %10;
        nr = nr /10;
        int cifraMijlocie = nr %10;
        nr = nr /10;
        int primaCifra = nr;
        System.out.println(ultimaCifra);
        System.out.println(primaCifra);
        System.out.println(cifraMijlocie);
        if (primaCifra %2 == 1 && cifraMijlocie %2 == 1 && ultimaCifra %2 == 1) {
            System.out.println("Toate sunt impare");
        } else{
            System.out.println("nu toate sunt impare");
        }
    }
}
