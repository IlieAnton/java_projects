package Materie20082022.Liste2;

import java.util.ArrayList;

public class Tema4 {
    public static void main(String[] args) {
        ArrayList<Integer> n = new ArrayList<>();
        n.add(1);
        n.add(9);
        n.add(4);
        n.add(3);
        int max = n.get(0);
        int min = n.get(0);
        int pmax = 0;
        int pmin = 0;
        int p1 = 0;
        int p2 = 0;
        for (int i = 0; i <= n.size() - 1; i = i + 1) {
            if (n.get(i) > max) {
                max = n.get(i);
                if (n.get(1) < min) {
                    min = n.get(i);
                }
            }
            for (int i1 = 0; i <= n.size() - 1; i = i + 1) {
                if (n.get(i) == max) {
                    n.get(i);
                    pmax = i;
                }
                if (n.get(i) == min) {
                    n.get(i);
                    pmin = i;
                }
            }
            p1 = pmin + 2;
            p2 = pmin + 3;
            //    p1 = p1 -1;
            //    p2 = p1-1;
            System.out.println("Pozitie max: " + pmax);
            System.out.println("Pozitie min: " + pmin);
            pmin = pmin + 1;
            pmax = pmax + 2;
            System.out.println("Elementele Vectorului sunt: " + pmin + " " + p1 + " " + pmax * 2 + " " + p2);
        }
    }
}

