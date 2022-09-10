package Materie20082022.AlteMiciPrograme;

import java.util.Scanner;

public class Elev {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nr = scanner.nextInt();
        if (nr <= 4) {
            System.out.println("Nu esti promovat, invata mai bine data vitoare!");
        } else {
            System.out.println("Esti promovat pentru merite, bineinteles, sau poate am dat eu o nota mai mare...? ");
        }
    }
}
