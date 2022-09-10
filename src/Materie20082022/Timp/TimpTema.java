package Materie20082022.Timp;

import java.util.Scanner;

public class TimpTema {
    public static void main(String[] args) throws InterruptedException {
        Scanner s = new Scanner(System.in);
        System.out.println("Bun venit la ghicitorul de taste");
        System.out.println("Ai 10 secunde sa introduci un cuvant. Ce cuvant doresti tu. Chiar propozitii.");
        System.out.println("Dupa 10 secunde voi afisa exact ceea ce ai scris tu.");
        System.out.println("Start!");
        String s1 = s.nextLine();
        Thread.sleep(10 * 1000);
        System.out.println("Asteapta 10 secunde ca sa ma gandesc ce ai scris:");
        Thread.sleep(10 * 1000);
        System.out.println("Hopa, ai scris :" + s1);

    }
}
