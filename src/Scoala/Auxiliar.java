package Scoala;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Auxiliar {
    public static void main(String[] args) {
        ArrayList<Integer> nr = new ArrayList<Integer>();
        nr.add(4);
        nr.add(7);
        nr.add(18);
        nr.add(10);
        int mare = nr.get(0);
        for (int i = 0; i <= nr.size()-1; i=i+1) {
            if (mare < nr.get(i)) {
                mare = nr.get(i);
            }
        }
        System.out.println(mare);
    }
}
