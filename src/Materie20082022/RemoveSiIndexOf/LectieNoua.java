package Materie20082022.RemoveSiIndexOf;

import java.util.ArrayList;
import java.util.Collections;

public class LectieNoua {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        Collections.addAll(a,1,2,3,4,5,6,7,8);
        if (a.contains(4)) {
            System.out.println("4 este in lista");
        } else {
            System.out.println("4 nu este in lista");
        }
    }
}