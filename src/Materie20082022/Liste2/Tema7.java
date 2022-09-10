package Materie20082022.Liste2;

import java.util.ArrayList;

public class Tema7 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(4);
        list.add(5);
        int nrpar1 = 0;
        int nrpar2 = list.get(0);
        int sum = 0;
        for (int i = 0; i <= list.size() - 1; i = i + 1) {
            if (list.get(i) % 2 == 0) {
                nrpar1 = list.get(i);
            }
            if (list.get(i) % 2 == 0 && list.get(i) < nrpar1) {
                nrpar2 = list.get(i);
            }
        }

        System.out.println(nrpar1);
        System.out.println(nrpar2);
        System.out.println("Suma este " + (list.get(1) + list.get(2)));

    }
}

