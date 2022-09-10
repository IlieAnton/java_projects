package Materie20082022.RemoveSiIndexOf;

import java.util.ArrayList;
import java.util.Collections;

public class p2v2 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        Collections.addAll(a,2,3,4,5,6,4,8,4);
        int pozitie = 0;
        for (int i =0; i <= a.size()-1; i=i+1) {
            if (a.get(i) == 4) {
                pozitie = i;
            }
        }
        System.out.println(pozitie);

        if (pozitie > 0) {
            a.remove(pozitie);
            System.out.println(a);
        } else if (pozitie < -1) {
            System.out.println("4 nu este in lista.");
        }
    }
}
