package Materie20082022.RemoveSiIndexOf;

import java.util.ArrayList;
import java.util.Collections;

public class p1v2 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        Collections.addAll(a, 1, 2, 4, 3, 5, 6, 7);
        int pozitie = 0;
        for (int i = 0; i <= a.size() - 1; i = i + 1) {
            if (a.get(i) == 4) {
                pozitie = i;
            }
        }
        if (pozitie % 2 == 0) {
            a.remove(pozitie);
        } else if (pozitie <= -1) {
            System.out.println("4 nu este in lista.");
        } else {
            a.add(4);
            System.out.println(a);
        }
    }
}
