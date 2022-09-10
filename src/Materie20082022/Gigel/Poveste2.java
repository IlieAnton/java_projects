package Materie20082022.Gigel;

public class Poveste2 {
    public static void main(String[] args) {
        String[] nume = {"Mircea", "Vlad", "Nea Costica", "Materie20082022/Gigel"};
        int pozitieGigel = -1;
        int len = nume.length;
        for (int i = 0; i <= len - 1; i = i + 1) {
            if (nume[i].contains("Materie20082022/Gigel")) {
                pozitieGigel = i;

            }
        }
        if (pozitieGigel == -1) {
            System.out.println("Materie20082022.Gigel este de negasit");
        } else {
            System.out.println("Materie20082022.Gigel a fost gasit, iar pozitia lui este " + pozitieGigel);
        }
    }
}

