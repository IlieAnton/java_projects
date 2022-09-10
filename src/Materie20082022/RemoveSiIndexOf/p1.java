package Materie20082022.RemoveSiIndexOf;

import java.util.ArrayList;
import java.util.Collections;

public class p1 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        Collections.addAll(a, 1, 2, 3, 4, 5, 6, 7);
        int pozitie = 0;
        pozitie = a.indexOf(4);
        if (pozitie % 2 == 0) {
            a.remove(pozitie);
        } else if (pozitie <= -1) {
            System.out.println("4 nu este in lista.");
        } else {
            a.add(4);
        }
        System.out.println(a);
    }
}
