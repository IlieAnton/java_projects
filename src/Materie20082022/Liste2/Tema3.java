package Materie20082022.Liste2;

import java.util.ArrayList;

public class Tema3 {
    public static void main(String[] args) {
        ArrayList<Integer> nr = new ArrayList();
        nr.add(1);
        nr.add(2);
        nr.add(4);
        nr.add(3);
        int max = nr.get(0);
        int min = nr.get(0);
        int pmax = 0;
        int pmin = 0;
        int p1 = 0;
        int p2 = 0;
        for (int i = 0; i <= nr.size() - 1; i = i + 1) {
            if (nr.get(i) > max) {
                max = nr.get(i);
            }
            if (nr.get(1) < min) {
                min = nr.get(i);
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("-------------------------");
        for (int i =  0; i <= nr.size()-1; i=i+1) {
            if (nr.get(i) == max) {
                nr.get(i);
                pmax = i;
            }
            if (nr.get(i) == min) {
                nr.get(i);
                pmin = i;
            }
        }
        p1 = pmin +2;
        p2 = pmin+3;
    //    p1 = p1 -1;
    //    p2 = p1-1;
        System.out.println("Pozitie max: " + pmax);
        System.out.println("Pozitie min: " + pmin);
        pmin = pmin +1;
        pmax = pmax +2;
        System.out.println("Elementele Vectorului sunt: " + pmin + " " + p1 + " " + pmax + " " + p2);
    }
}
