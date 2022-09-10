package Materie20082022.RemoveSiIndexOf;

import java.util.ArrayList;
import java.util.Collections;

public class p2 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        Collections.addAll(a,2,3,4,5,6,4,8,4);
        int pozitie = 0;
        pozitie = a.lastIndexOf(4);
            a.remove(pozitie);
        System.out.println(a);

    }
}
