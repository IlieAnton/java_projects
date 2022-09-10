package Materie20082022.Programe;

import java.util.Scanner;

public class Rusia {
    public static void main(String[] args) {
        int nrsoldati = 20000;
        int pierderiatac = nrsoldati-3000;
        int pierderiaparare = nrsoldati-1200;
        System.out.println("Ai 20 de mii de soldati");
        System.out.println("Ataci sau aperi?");
        Scanner scanner = new Scanner(System.in);
        String  nr = scanner.nextLine();
        if (scanner.equals("atac")) {
            System.out.println("Ai pierdut " +  pierderiatac + " de soldati, dar pozitia a fost cucerita");
        }else if (nr.equals("apar")) {
            System.out.println("Ai pierdut " + pierderiaparare + " de soldati, pozitia a fost aparata");
        }
    }
}
