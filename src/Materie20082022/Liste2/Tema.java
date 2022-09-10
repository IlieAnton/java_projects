package Materie20082022.Liste2;

import java.util.ArrayList;

public class Tema {
    public static void main(String[] args) {
        int nrpare = 0;
        int nrimpare = 0;
        ArrayList<Integer> nr = new ArrayList();
        nr.add(1);
        nr.add(2);
        nr.add(2);
        nr.add(2);
        nr.add(2);
        nr.add(2);
        nr.add(2);
        nr.add(3);
        nr.add(4);
        nr.add(5);
        nr.add(6);
        for (int i = 0; i <= nr.size() - 1; i = i + 1) {
            if (nr.get(i) % 2 == 0) {
                nrpare = nrpare + 1;
            } else {
                nrimpare = nrimpare + 1;
            }
        }
        System.out.println(nrpare);
        System.out.println(nrimpare);
        if (nrimpare > nrpare) {
            System.out.println(nrimpare - nrpare);
        } else {
            System.out.println(nrpare - nrimpare);
        }
    }
}
